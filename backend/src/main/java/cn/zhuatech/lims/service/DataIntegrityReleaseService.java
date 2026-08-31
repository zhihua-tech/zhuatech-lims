/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.lims.service;
import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class DataIntegrityReleaseService {
    public Result evaluate(Request request) {
        List<String> blockers = new ArrayList<>();
        if (!request.rawDataLinked()) blockers.add("检验结果未关联原始数据");
        if (!request.auditTrailReviewed()) blockers.add("审计追踪尚未复核");
        if (!request.analystQualified()) blockers.add("检验人员资质无效");
        if (request.openOos()) blockers.add("存在未关闭的 OOS 调查");
        if (!request.chainOfCustodyComplete()) blockers.add("样品交接链不完整");
        if (!request.secondReviewerApproved()) blockers.add("第二复核人尚未批准");
        int alcoaScore = Math.max(0, 100 - blockers.size() * 17);
        String decision = blockers.isEmpty() ? "RELEASE" : request.openOos() ? "HOLD" : "REVIEW";
        return new Result(request.sampleNo(), decision, alcoaScore, blockers.isEmpty(),
                List.copyOf(blockers), List.of("ATTRIBUTABLE", "LEGIBLE", "CONTEMPORANEOUS", "ORIGINAL", "ACCURATE"));
    }
    public record Request(@NotBlank String sampleNo, boolean rawDataLinked,
                          boolean auditTrailReviewed, boolean analystQualified,
                          boolean openOos, boolean chainOfCustodyComplete,
                          boolean secondReviewerApproved) {
        public Request { if (sampleNo == null || sampleNo.isBlank()) throw new IllegalArgumentException("sampleNo is required"); }
    }
    public record Result(String sampleNo, String decision, int alcoaScore,
                         boolean reportReleaseAllowed, List<String> blockers, List<String> principlesChecked) {}
}
