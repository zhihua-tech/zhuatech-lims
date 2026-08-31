# 企业级实验室数据完整性

新增 `POST /api/enterprise/laboratory/data-integrity`，按照 ALCOA+ 原则检查原始数据、审计追踪、人员资质、OOS、样品交接链和第二复核。

只有所有控制项通过时才允许报告放行；未关闭 OOS 会直接进入保持状态。
