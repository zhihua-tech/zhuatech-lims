/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.lims.model;
import jakarta.persistence.*; import java.time.LocalDateTime;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@Entity @Table(name="lims_sample") public class Sample extends BaseEntity {
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public enum Result { PENDING, PASSED, FAILED }
    @Column(nullable=false,unique=true,length=32) private String sampleNo; @ManyToOne(optional=false,fetch=FetchType.LAZY) private TestOrder testOrder;
    @Column(nullable=false,length=30) private String sampleType; @Column(nullable=false) private int sampleQty; @Column(nullable=false) private int defectQty; @Enumerated(EnumType.STRING) @Column(nullable=false,length=20) private Result result;
    @Column(length=50) private String inspector; @Column(nullable=false) private LocalDateTime createdAt;
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    protected Sample(){} /**
                          * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                          */
public Sample(String sampleNo,TestOrder testOrder,String sampleType,int sampleQty,int defectQty,Result result,String inspector){this.sampleNo=sampleNo;this.testOrder=testOrder;this.sampleType=sampleType;this.sampleQty=sampleQty;this.defectQty=defectQty;this.result=result;this.inspector=inspector;this.createdAt=LocalDateTime.now();}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getSampleNo(){return sampleNo;} /**
                                                   * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                   */
public TestOrder getTestOrder(){return testOrder;} /**
                                                                                                      * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                      */
public String getSampleType(){return sampleType;} /**
                                                                                                                                                        * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                        */
public int getSampleQty(){return sampleQty;} /**
                                                                                                                                                                                                     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                     */
public int getDefectQty(){return defectQty;} /**
                                                                                                                                                                                                                                                  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                  */
public Result getResult(){return result;} /**
                                                                                                                                                                                                                                                                                            * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                                                            */
public String getInspector(){return inspector;}
}
