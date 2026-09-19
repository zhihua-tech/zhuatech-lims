/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.lims.controller;
import cn.zhuatech.lims.common.ApiResponse; import cn.zhuatech.lims.service.BatchReleaseService; import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController @RequestMapping("/api/admin") public class BatchReleaseController {private final BatchReleaseService service; /**
                                                                                                                               * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                               */
public BatchReleaseController(BatchReleaseService service){this.service=service;} /**
                                                                                                                                                                                                                 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                 */
@PostMapping("/batch-release") public ApiResponse<BatchReleaseService.Result> evaluate(@Valid @RequestBody BatchReleaseService.Request request){return ApiResponse.ok(service.evaluate(request));}}

