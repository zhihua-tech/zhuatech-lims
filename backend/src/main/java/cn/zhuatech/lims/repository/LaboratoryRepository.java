/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.lims.repository; import cn.zhuatech.lims.model.Laboratory; import org.springframework.data.jpa.repository.JpaRepository; import java.util.Optional;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
public interface LaboratoryRepository extends JpaRepository<Laboratory,Long>{/**
                                                                              * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                              */
Optional<Laboratory> findByCode(String code);}
