/* Copyright 2026 上海如静知华信息科技有限公司 */
package cn.zhuatech.lims.controller;
import cn.zhuatech.lims.common.ApiResponse; import cn.zhuatech.lims.service.BatchReleaseService; import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/admin") public class BatchReleaseController {private final BatchReleaseService service; public BatchReleaseController(BatchReleaseService service){this.service=service;} @PostMapping("/batch-release") public ApiResponse<BatchReleaseService.Result> evaluate(@Valid @RequestBody BatchReleaseService.Request request){return ApiResponse.ok(service.evaluate(request));}}

