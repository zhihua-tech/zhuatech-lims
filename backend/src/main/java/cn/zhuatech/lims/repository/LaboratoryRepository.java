/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.lims.repository; import cn.zhuatech.lims.model.Laboratory; import org.springframework.data.jpa.repository.JpaRepository; import java.util.Optional;
public interface LaboratoryRepository extends JpaRepository<Laboratory,Long>{Optional<Laboratory> findByCode(String code);}
