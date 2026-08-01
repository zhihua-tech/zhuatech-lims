# LIMS API 摘要

版权所有 © 2026 上海如静知华信息科技有限公司。

| 方法 | 路径 | 说明 |
| --- | --- | --- |
| POST | `/api/auth/login` | 登录并获取 JWT |
| GET | `/api/admin/dashboard` | 实验室运营数据 |
| GET | `/api/admin/work-orders` | 检测任务清单 |
| GET | `/api/shopfloor/dashboard` | 工程师任务工作台 |
| POST | `/api/shopfloor/work-orders/{id}/reports` | 提交检测结果 |
| POST | `/api/admin/batch-release` | 判断样本检测批次是否可放行 |
