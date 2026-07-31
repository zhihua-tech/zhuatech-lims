/* Copyright 2026 上海如静知华信息科技有限公司 */
export const domain={
 code:'LIMS',systemName:'实验室信息管理系统',englishName:'LABORATORY INFORMATION MANAGEMENT',
 theme:{primary:'#1f746d',dark:'#19302d',accent:'#b47735'},
 workspace:'质量中心 / 实验室运营',fieldWorkspace:'理化分析实验室',period:'2026-08-01 · 周六',liveText:'仪器数据链路正常',
 fieldContextLabel:'当前实验室',fieldContext:'日班 · 08:30—17:30',fieldUser:'陆承',fieldRole:'检测工程师',adminUser:'周妍',adminRole:'实验室主管',
 adminTitle:'实验室运营驾驶舱',adminBreadcrumb:'实验室运营 / 今日态势',adminSubtitle:'集中查看收样、检测、复核、仪器与时限风险。',exportAction:'导出检测日报',createAction:'新建检测任务',
 chartTitle:'检测完成趋势',chartSubtitle:'当日累计完成率 / 计划目标',chartLabels:['08:30','09:30','10:30','11:30','13:30','14:30','15:30','16:30','17:30'],loadTitle:'实验室负荷',loadSubtitle:'在检任务占可用能力',recordsTitle:'在检任务',recordsSubtitle:'按承诺时限与异常优先显示',issueTitle:'质量与时限风险',issueSubtitle:'需要实验室主管处理的事项',
 recordName:'检测任务',itemName:'样品 / 项目',unitName:'实验室',batchName:'样品批次',planName:'计划项目',doneName:'已完成',exceptionName:'异常',unitLabel:'项',
 listBreadcrumb:'检测管理 / 任务台账',listSubtitle:'统一管理收样、任务分派、检测、复核与报告签发。',listSummary:[['今日收样','54'],['在检任务','31'],['待复核','8'],['超时风险','2',true]],tabs:['全部','待确认','检测中','待复核','已完成'],
 fieldBreadcrumb:'检测执行 / 我的工作台',fieldTitle:'理化检测工作台',fieldSubtitle:'当前 7 项在检任务 · 2 台仪器已预约 · 工程师陆承',fieldSecondary:'交接记录',reportAction:'录入结果',fieldNoticeTitle:'环境状态合规',fieldNotice:'温湿度、仪器校准和标准品状态均满足检测要求',
 steps:['收样确认','样品前处理','仪器检测','结果复核','报告签发'],documentAction:'查看检测方法',printAction:'打印样品标签',resourceCardTitle:'仪器状态',resourceValueLabel:'当前柱压',resourceHealthLabel:'仪器健康度',quickSubtitle:'实验室高频业务入口',quickActions:[['结果录入','/shopfloor/report','原始数据与结果'],['样品流转','/shopfloor/material','交接与留样位置'],['仪器预约','/shopfloor/resources','日历与使用记录'],['偏差上报','/shopfloor/andon','OOS / OOT / 环境异常']],
 reportDefaults:[3,0],reportTitle:'检测结果录入',reportSubtitle:'记录原始结果、异常数量和检测过程备注。',reportSuccess:'检测结果已保存并进入复核队列',reportPlaceholder:'填写计算依据、异常现象或重复检测说明',reportFootnote:'提交后写入原始记录并生成审计轨迹',ruleTitle:'方法控制要求',ruleSubtitle:'HPLC-042 · V4.3',rules:[['进样体积','10 μL'],['流速','1.0 mL/min'],['系统适用性','RSD ≤ 2.0%'],['仪器校准','有效',true]],fieldTotals:[['16','已完成项目'],['1','异常结果'],['5','待复核结果'],['98.2%','数据完整率']],
 adminMenus:[['/admin','home','运营驾驶舱'],['/admin/work-orders','order','检测任务'],['/admin/samples','box','样品管理'],['/admin/schedule','calendar','排班预约'],['/admin/methods','process','方法与标准'],['/admin/reviews','quality','结果复核'],['/admin/resources','machine','仪器设备'],['/admin/report','chart','质量分析']],
 fieldMenus:[['/shopfloor','home','我的工作台'],['/shopfloor/report','report','结果录入'],['/shopfloor/tasks','order','待检任务'],['/shopfloor/material','box','样品流转'],['/shopfloor/resources','machine','仪器预约'],['/shopfloor/andon','risk','偏差上报',1]],
 moduleTitles:{tasks:['待检任务','查看任务优先级、样品状态与承诺时限'],material:['样品流转','跟踪接收、分样、留样与销毁全过程'],resources:['仪器预约','管理仪器档期、校准和使用记录'],andon:['偏差上报','登记并跟踪 OOS、OOT 与环境偏差'],samples:['样品管理','管理样品登记、标签、位置和生命周期'],schedule:['排班预约','协调人员、仪器和方法的可用时间'],methods:['方法与标准','维护检测方法、限度和标准物质'],reviews:['结果复核','执行数据审核、报告批准和电子签名'],report:['质量分析','分析周转时间、一次通过率和偏差趋势']},
 tagline:'让每一份检测结果都有完整证据链',storyTitle:'从收样到报告，<br/>每个结果都可复核、可追溯。',storyText:'连接样品、方法、仪器、人员与原始数据的实验室数字底座。',pattern:[2,3,8,9,10,15,16,17,22,23,24,29,30,31],loginStats:[['98.2%','数据完整率'],['31','当前在检任务'],['2.6h','平均周转时间']],loginTitle:'实验室质量中心',adminDemo:'任务 / 样品 / 复核',fieldDemo:'检测 / 结果 / 偏差'
}
export const records=[
 {no:'TR-260801-018',name:'高强钢拉伸试样',code:'GB/T 228.1',unit:'材料可靠性实验室',group:'质量中心',plan:24,done:16,exception:1,due:'08-02',batch:'S260801-A',status:'检测中',progress:67,priority:'加急'},
 {no:'TR-260801-021',name:'原料药纯度样品',code:'HPLC-042',unit:'理化分析实验室',group:'质量中心',plan:18,done:8,exception:0,due:'08-02',batch:'S260801-C',status:'检测中',progress:44,priority:'正常'},
 {no:'TR-260802-006',name:'成品微生物限度样',code:'ISO 4833',unit:'微生物实验室',group:'研发中心',plan:12,done:0,exception:0,due:'08-04',batch:'S260802-B',status:'待确认',progress:0,priority:'正常'},
 {no:'TR-260731-015',name:'铝合金元素分析样',code:'ICP-017',unit:'理化分析实验室',group:'质量中心',plan:20,done:20,exception:1,due:'08-01',batch:'S260731-D',status:'已完成',progress:100,priority:'正常'},
 {no:'TR-260801-024',name:'包装材料迁移量样品',code:'GC-MS-011',unit:'理化分析实验室',group:'质量中心',plan:15,done:10,exception:0,due:'08-03',batch:'S260801-E',status:'待复核',progress:67,priority:'关注'}]
export const resources=[{code:'INS-HPLC-03',name:'高效液相色谱仪 03',unit:'理化分析实验室',status:'运行',health:88,value:'11.8',valueUnit:'MPa',note:'方法 HPLC-042 · 序列 8/18'},{code:'INS-UTM-05',name:'电子万能试验机',unit:'材料可靠性实验室',status:'运行',health:91,value:'82',valueUnit:'kN',note:'夹具校验有效至 2026-10'},{code:'INS-INC-08',name:'恒温培养箱 08',unit:'微生物实验室',status:'报警',health:62,value:'36.8',valueUnit:'°C',note:'温度上限预警待确认'}]
export const reviews=[{no:'REV-260801-032',title:'拉伸试验原始数据复核',type:'结果复核',detail:'6 组数据 · 周妍',result:'通过'},{no:'REV-260801-011',title:'纯度样系统适用性复核',type:'数据审核',detail:'3 次进样 · 顾清',result:'待确认'},{no:'REV-260731-018',title:'元素分析偏差调查',type:'偏差评审',detail:'OOS-260731-02',result:'异常'}]
export const adminMetrics=[['今日收样','54','较昨日增加 8 份','blue'],['按时完成率','96.8%','目标值 ≥ 95.0%','green'],['待复核结果','8','其中 2 项加急','orange'],['偏差 / OOS','2','1 项进入调查','red']]
export const fieldMetrics=[['今日任务','7','18 个检测项目','blue'],['已完成','16','当前进度 67%','green'],['待复核','5','数据已完整提交','orange'],['仪器档期','至 14:30','HPLC-03 当前序列','slate']]
export const chartActual=[8,18,29,42,49,61,72,84,91],chartTarget=[10,21,32,43,54,65,76,87,98]
export const loads=[['理化分析实验室',92,'12 项在检'],['材料可靠性实验室',78,'8 项在检'],['微生物实验室',71,'6 项在检'],['环境监测实验室',56,'5 项在检']]
export const issues=[{type:'仪器',title:'培养箱温度短时越限',detail:'INS-INC-08 · 持续 7 分钟',status:'调查中'},{type:'结果',title:'铝合金 Fe 元素结果超限',detail:'OOS-260731-02 · 等待复测',status:'待判定'},{type:'时限',title:'GC-MS 队列可能影响承诺时间',detail:'预计延迟 45 分钟',status:'协调中'}]
