/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.lims.repository; import cn.zhuatech.lims.model.Instrument; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface InstrumentRepository extends JpaRepository<Instrument,Long>{List<Instrument> findAllByOrderByCodeAsc();long countByStatus(Instrument.Status status);}
