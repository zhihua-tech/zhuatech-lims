/* Copyright 2026 上海如静知华信息科技有限公司 */
package cn.zhuatech.lims.config;

import cn.zhuatech.lims.model.*;
import cn.zhuatech.lims.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner seed(LaboratoryRepository laboratories, TestOrderRepository orders,
                           InstrumentRepository instruments, SampleRepository samples,
                           UserRepository users, PasswordEncoder encoder) {
        return args -> {
            if (laboratories.count() > 0) return;
            Laboratory chemistry = laboratories.save(new Laboratory("LAB-CHEM", "理化分析实验室", "质量中心", 180));
            Laboratory micro = laboratories.save(new Laboratory("LAB-MICRO", "微生物实验室", "研发中心", 120));
            Laboratory material = laboratories.save(new Laboratory("LAB-MAT", "材料可靠性实验室", "工程中心", 96));

            TestOrder t1 = orders.save(new TestOrder("TR-260801-018", "GB-T-228", "高强钢拉伸试样", material, 24, 16, 1, LocalDate.now().plusDays(1), TestOrder.Status.RUNNING, "S260801-A"));
            TestOrder t2 = orders.save(new TestOrder("TR-260801-021", "HPLC-042", "原料药纯度样品", chemistry, 18, 8, 0, LocalDate.now().plusDays(1), TestOrder.Status.RUNNING, "S260801-C"));
            TestOrder t3 = orders.save(new TestOrder("TR-260802-006", "ISO-4833", "成品微生物限度样", micro, 12, 0, 0, LocalDate.now().plusDays(3), TestOrder.Status.RELEASED, "S260802-B"));
            TestOrder t4 = orders.save(new TestOrder("TR-260731-015", "ICP-017", "铝合金元素分析样", chemistry, 20, 20, 1, LocalDate.now(), TestOrder.Status.COMPLETED, "S260731-D"));

            instruments.saveAll(List.of(
                new Instrument("INS-HPLC-03", "高效液相色谱仪 03", chemistry, Instrument.Status.RUNNING, 88),
                new Instrument("INS-ICP-02", "电感耦合等离子光谱仪", chemistry, Instrument.Status.IDLE, 76),
                new Instrument("INS-UTM-05", "电子万能试验机", material, Instrument.Status.RUNNING, 91),
                new Instrument("INS-INC-08", "恒温培养箱 08", micro, Instrument.Status.ALARM, 62)
            ));
            samples.saveAll(List.of(
                new Sample("SMP-260801-032", t1, "留样复核", 6, 0, Sample.Result.PASSED, "周妍"),
                new Sample("SMP-260801-011", t2, "前处理复核", 3, 0, Sample.Result.PASSED, "陆承"),
                new Sample("SMP-260801-018", t4, "结果复核", 5, 1, Sample.Result.FAILED, "周妍"),
                new Sample("SMP-260802-003", t3, "收样确认", 4, 0, Sample.Result.PENDING, "陆承")
            ));
            String demo = encoder.encode("Demo@2026");
            users.saveAll(List.of(
                new UserAccount("operator", demo, "陆承", UserAccount.Role.TECHNICIAN, "LAB-CHEM"),
                new UserAccount("planner", demo, "周妍", UserAccount.Role.LAB_MANAGER, null),
                new UserAccount("quality", demo, "顾清", UserAccount.Role.QUALITY, null),
                new UserAccount("admin", encoder.encode("ZhuaTech@2026"), "系统管理员", UserAccount.Role.ADMIN, null)
            ));
        };
    }
}
