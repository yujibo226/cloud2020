### sszx手机端接口

# common.js
1. 获取推荐课程列表 /wx/courses/recommend   WxCoursesController
2. 播放记录 /wx/coursesRecord/add   WxCoursesRecordController
3. 记录用户点击记录 /wx/coursesBrowseLog    CoursesBrowseController
4. 订阅课程 /wx/user/sub/${cid} UserCoursesController
5. 获取微信config /wx/web/${appid}/jsapi    WxMpWebController
鉴权 验签 获取签证 入参 url: encodeURI(location.href.split('#')[0]),
7. 人脸识别 /tencent/ocr/analysis   TencentOcrController
# confirmOrder.js
8. 根据订单id获取订单信息 /wx/order OrdersController
9. 根据精华订单id查询精华课程信息 /wx/ticketOrder   OrdersController
10. 获取微信支付参数-普通课程 /wx/pay/createOrder   WxPayController
11. 获取微信支付参数-训练营 /wx/pay/createCampOrder WxPayController
12. 获取微信支付参数-公开年卡 /wx/pay/createVipOrder    WxPayController
13. 获取微信支付参数-精华年卡 /wx/pay/createEssenceOrder    WxPayController
14. 校验是否认证过(老学员) /wx/auth/check   SysUserController
15. 是否老学员 /wx/oldUser/check    SysUserController
16. 获取优惠券 /wx/coupon   CouponController
# dayUpdate.js
17. 获取财经六点半课程详情 /wx/courses/info?cid=${cid}  WxCoursesController
课程id=224
# detail.js
18. 获取课程详细信息 /wx/courses/${cid}/step WxCoursesController
id是课程id
19. 创建预支付订单 /wx/createOrder  OrdersController
20. 创建拼团预支付订单 /wx/pay/createPinkOrder  WxPayController
21. 生成海报接口 /wx/poster/generate/${cid} WxPosterController
22. 获取新的token /wx/aes 加密token WxLoginController
23. 获取手机短信验证码 /aliyun/send/${phone}    VerifyCodeController
24. 提交短信验证码 /aliyun/verify   VerifyCodeController
25. 添加分享统计 /wx/shareLog   ShareLogController
# edite.js
26. 修改用户信息 /wx/user/info  SysUserController
请求方式 patch
27. 查询用户信息 /wx/user/info  SysUserController
请求方式 get
# groupBuy.js
28. 首页数据 /wx/pink/courses   WxPinkController
获取所有拼团课程
29. 根据团id查询团信息 /wx/pink/info    WxPinkController
# home.js
30. 首页数据 /wx/courses/index  WxCoursesController
首页列表 - 轮播图，日更，首页卡包课程分类
31. 首页数据 /wx/courses/activity   WxCoursesController
首页活动列表
# information.js
32. 获取资讯列表 /wx/article    ArticleController
文章列表
33. 获取资讯详情 /wx/article/${id}  ArticleController
文章详情
34. 获取资讯评论 /wx/articleComment ArticleCommentController
文章评论
35. 获取资讯评论详情 /wx/articleComment ArticleCommentController
文章评论详情
# live.js
36 首页数据 /wx/liveBroadcast   LiveBroadcastController
直播
# mediaPlayer.js
37. 获取课程评论列表 /wx/coursesComment CoursesCommentController
get
38. 课程评论列表增加 /wx/coursesComment CoursesCommentController
post
# more.js
39. 根据分类 /wx/courses/category   WxCoursesController
根据课程分类id查询课程列表
40. 首页搜索 /wx/courses/search WxCoursesController
根据关键字搜索课程信息
# my.js
41. 根据用户id获取已购买课程 /wx/user/my    UserCoursesController
42. 根据分享人unionid查询被分享人用户信息 /wx/my/invite InviteRateController
43. 校验运营商身份 /wx/user/check  SysUserController
44. 获取签到二维码 /wx/ticket/qrcode    WxTicketController
45. 获取邀约人信息 /wx/inviteInfo   WxTicketController
获取当前用户的邀约人信息
# question.js
46. 获取调查问卷 /wx/vote/1 VoteController
47. 提交调查问卷 /wx/voteValue  VoteController
48. 获取会议列表接口 ${process.env.VUE_APP_BASE_API_BSH}/api/online/onLineMeetList
49. 获取会议明细接口 ${process.env.VUE_APP_BASE_API_BSH}/api/online/meetDetail
50. 判断是否填写过调查问卷 /wx/vote/checkVote   VoteController
51. 会议报名接口 /wx/ticket/onLineSignUp    WxTicketController
# receive.js
52. 免费领取 /wx/receiveLog ReceiveLogController
53. 获取领取课程详情 /wx/gift/${id} GiftController
# user.js
54. 登录接口 /wx/login  WxLoginController
# yearcard.js
56. 获取年卡列表 /wx/coursesCategory?type=${type}   CoursesCategoryController
57. 获取用户是否关注公众号 /wx/subscribe    WxCommonController
校验是否关注公众号
58. 获取卡包详情信息 /wx/vipCard/${id}  VipCardController
59. 获取博士会uniId ${process.env.VUE_APP_BASE_API_BSH}/api/member/onLineInvitationCheck
60. 下订单接口 /wx/pay/createVipOrder   WxPayController
61. 获取二维码接口 /wx/qyWx QyWxController
62. 获取小白训练营详细信息 /wx/camp/${id}   CampController
63. 精华会议订单 /wx/pay/createEssenceOrder WxPayController
购买精华会议 BSH_URL + "/meet/ticket/onLineBuyGeneralTicket
64. 获取小白训练营详细信息 /wx/camp CampController