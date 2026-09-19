/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.lims.controller;import cn.zhuatech.lims.common.ApiResponse;import cn.zhuatech.lims.service.SampleStabilityService;import jakarta.validation.Valid;import org.springframework.web.bind.annotation.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController @RequestMapping("/api/lims/insights/sample-stability") public class SampleStabilityController{private final SampleStabilityService service;/**
                                                                                                                                                            * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                            */
public SampleStabilityController(SampleStabilityService service){this.service=service;}/**
                                                                                                                                                                                                                                                   * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                   */
@PostMapping ApiResponse<SampleStabilityService.Result> evaluate(@Valid @RequestBody SampleStabilityService.Request r){return ApiResponse.ok(service.evaluate(r));}}
