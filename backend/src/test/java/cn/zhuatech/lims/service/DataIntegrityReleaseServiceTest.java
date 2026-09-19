/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.lims.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
class DataIntegrityReleaseServiceTest {
    private final DataIntegrityReleaseService service = new DataIntegrityReleaseService();
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void releasesReportWhenAlcoaControlsPass() {
        var result = service.evaluate(new DataIntegrityReleaseService.Request(
                "SMP-001", true, true, true, false, true, true));
        assertEquals("RELEASE", result.decision());
        assertEquals(100, result.alcoaScore());
        assertTrue(result.reportReleaseAllowed());
    }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void holdsReportForOpenOosAndMissingEvidence() {
        var result = service.evaluate(new DataIntegrityReleaseService.Request(
                "SMP-002", false, false, true, true, false, false));
        assertEquals("HOLD", result.decision());
        assertEquals(5, result.blockers().size());
        assertFalse(result.reportReleaseAllowed());
    }
}
