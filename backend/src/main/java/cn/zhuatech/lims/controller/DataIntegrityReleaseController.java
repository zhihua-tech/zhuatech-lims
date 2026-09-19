/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.lims.controller;
import cn.zhuatech.lims.common.ApiResponse;
import cn.zhuatech.lims.service.DataIntegrityReleaseService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController
@RequestMapping("/api/enterprise/laboratory")
public class DataIntegrityReleaseController {
    private final DataIntegrityReleaseService service;
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public DataIntegrityReleaseController(DataIntegrityReleaseService service) { this.service = service; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping("/data-integrity")
    public ApiResponse<DataIntegrityReleaseService.Result> evaluate(
            @Valid @RequestBody DataIntegrityReleaseService.Request request) { return ApiResponse.ok(service.evaluate(request)); }
}
