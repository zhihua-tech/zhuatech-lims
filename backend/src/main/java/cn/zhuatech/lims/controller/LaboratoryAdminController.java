/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.lims.controller; import cn.zhuatech.lims.common.ApiResponse; import cn.zhuatech.lims.dto.LimsDto.*; import cn.zhuatech.lims.service.LimsService; import org.springframework.security.access.prepost.PreAuthorize; import org.springframework.web.bind.annotation.*; import java.util.List;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController @RequestMapping("/api/admin") @PreAuthorize("hasAnyRole('LAB_MANAGER','QUALITY','ADMIN')") public class LaboratoryAdminController {private final LimsService lims;/**
                                                                                                                                                                                   * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                   */
public LaboratoryAdminController(LimsService lims){this.lims=lims;}/**
                                                                                                                                                                                                                                                      * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                      */
@GetMapping("/dashboard") public ApiResponse<Dashboard> dashboard(){return ApiResponse.ok(lims.adminDashboard());}/**
                                                                                                                                                                                                                                                                                                                                                                        * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                                                                                                                                        */
@GetMapping("/work-orders") public ApiResponse<List<TestOrderView>> orders(){return ApiResponse.ok(lims.testOrders());}}
