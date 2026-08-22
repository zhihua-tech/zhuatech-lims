/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.lims.service;
import jakarta.validation.constraints.*; import org.springframework.stereotype.Service; import java.util.ArrayList; import java.util.List;
@Service public class BatchReleaseService {
    public Result evaluate(Request r){
        double completion=r.sampleCount()==0?0:Math.min(100,r.completedTests()*100.0/r.sampleCount());
        String decision=!r.calibrationValid()||!r.qcPassed()||!r.chainOfCustodyComplete()||r.outOfSpecResults()>0?"BLOCKED":r.pendingReviews()>0||completion<100?"REVIEW":"RELEASE";
        List<String> blockers=new ArrayList<>(); if(!r.calibrationValid())blockers.add("检测仪器校准状态无效"); if(!r.qcPassed())blockers.add("质量控制结果未通过");
        if(!r.chainOfCustodyComplete())blockers.add("样本流转链记录不完整"); if(r.outOfSpecResults()>0)blockers.add("存在超规格结果待调查"); if(r.pendingReviews()>0)blockers.add("存在未完成结果复核"); if(completion<100)blockers.add("检测任务尚未全部完成");
        return new Result(Math.round(completion*100)/100.0,r.sampleCount()-r.completedTests(),decision,blockers);
    }
    public record Request(@NotBlank String batchNo,@Positive int sampleCount,@Min(0) int completedTests,@Min(0) int outOfSpecResults,
        @Min(0) int pendingReviews,boolean calibrationValid,boolean qcPassed,boolean chainOfCustodyComplete){}
    public record Result(double completionRate,int remainingTests,String decision,List<String> blockers){}
}

