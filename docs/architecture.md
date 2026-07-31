# LIMS 架构

版权所有 © 2026 上海如静知华信息科技有限公司。

浏览器通过 Vue 管理端或检测工程师端访问 Spring Boot REST API。安全层完成 JWT 与角色鉴权，业务层负责检测任务、样品、仪器、复核和结果记录，JPA/Flyway 管理 MySQL 数据。

管理端角色为 `LAB_MANAGER`、`QUALITY`、`ADMIN`；执行端角色为 `TECHNICIAN`。正式部署建议将仪器连接置于独立采集服务，并隔离实验室网络和办公网络。
