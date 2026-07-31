/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.lims.repository; import cn.zhuatech.lims.model.UserAccount; import org.springframework.data.jpa.repository.JpaRepository; import java.util.Optional;
public interface UserRepository extends JpaRepository<UserAccount,Long>{Optional<UserAccount> findByUsername(String username);}
