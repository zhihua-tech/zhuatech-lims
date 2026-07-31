/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.lims.repository; import cn.zhuatech.lims.model.TestOrder; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface TestOrderRepository extends JpaRepository<TestOrder,Long>{List<TestOrder> findAllByOrderByDueDateAsc();List<TestOrder> findByLaboratoryCodeOrderByDueDateAsc(String code);long countByStatus(TestOrder.Status status);}
