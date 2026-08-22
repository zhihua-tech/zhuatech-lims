/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.lims.repository; import cn.zhuatech.lims.model.Sample; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface SampleRepository extends JpaRepository<Sample,Long>{List<Sample> findTop10ByOrderByIdDesc();long countByResult(Sample.Result result);}
