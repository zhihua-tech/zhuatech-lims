/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.lims;import cn.zhuatech.lims.service.SampleStabilityService;import org.junit.jupiter.api.Test;import static org.junit.jupiter.api.Assertions.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
class SampleStabilityServiceTests{private final SampleStabilityService s=new SampleStabilityService();/**
                                                                                                       * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                       */
@Test void recollectsExpiredSample(){var r=s.evaluate(new SampleStabilityService.Request("S1",30,24,false,true,true,false));assertEquals("RECOLLECT",r.status());}/**
                                                                                                                                                                                                                                                                         * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                                         */
@Test void acceptsFreshControlledSample(){var r=s.evaluate(new SampleStabilityService.Request("S2",5,24,false,true,false,false));assertEquals("ACCEPT",r.status());}}
