/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.lims.dto;
import jakarta.validation.constraints.*; import java.time.*; import java.util.List;
public final class LimsDto { private LimsDto(){}
    public record Metric(String label,String value,String hint,String tone){}
    public record TestOrderView(Long id,String orderNo,String productCode,String productName,String laboratory,String workshop,int plannedQty,int completedQty,int defectQty,LocalDate dueDate,String status,String batchNo,int progress){}
    public record InstrumentView(String code,String name,String laboratory,String status,int oee,LocalDateTime lastHeartbeat){}
    public record SampleView(String sampleNo,String orderNo,String productName,String sampleType,int sampleQty,int defectQty,String result,String inspector){}
    public record Dashboard(List<Metric> metrics,List<TestOrderView> testOrders,List<InstrumentView> instrument,List<SampleView> samples){}
    public record ReportRequest(@NotBlank String operationName,@Positive int goodQty,@PositiveOrZero int defectQty,@Size(max=200) String remark){}
    public record ReportResult(String orderNo,int completedQty,int defectQty,int progress,String status){}
}
