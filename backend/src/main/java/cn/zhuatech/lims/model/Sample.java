/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.lims.model;
import jakarta.persistence.*; import java.time.LocalDateTime;
@Entity @Table(name="lims_sample") public class Sample extends BaseEntity {
    public enum Result { PENDING, PASSED, FAILED }
    @Column(nullable=false,unique=true,length=32) private String sampleNo; @ManyToOne(optional=false,fetch=FetchType.LAZY) private TestOrder testOrder;
    @Column(nullable=false,length=30) private String sampleType; @Column(nullable=false) private int sampleQty; @Column(nullable=false) private int defectQty; @Enumerated(EnumType.STRING) @Column(nullable=false,length=20) private Result result;
    @Column(length=50) private String inspector; @Column(nullable=false) private LocalDateTime createdAt;
    protected Sample(){} public Sample(String sampleNo,TestOrder testOrder,String sampleType,int sampleQty,int defectQty,Result result,String inspector){this.sampleNo=sampleNo;this.testOrder=testOrder;this.sampleType=sampleType;this.sampleQty=sampleQty;this.defectQty=defectQty;this.result=result;this.inspector=inspector;this.createdAt=LocalDateTime.now();}
    public String getSampleNo(){return sampleNo;} public TestOrder getTestOrder(){return testOrder;} public String getSampleType(){return sampleType;} public int getSampleQty(){return sampleQty;} public int getDefectQty(){return defectQty;} public Result getResult(){return result;} public String getInspector(){return inspector;}
}
