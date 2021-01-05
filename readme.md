### sszx手机端接口

# common.js
1. 获取推荐课程列表 /wx/courses/recommend
2. 播放记录 /wx/coursesRecord/add
3. 记录用户点击记录 /wx/coursesBrowseLog
4. 订阅课程 /wx/user/sub/${cid}
5. 获取微信config /wx/web/${appid}/jsapi
鉴权 获取签证 入参 url: encodeURI(location.href.split('#')[0]),
6. 实名认证 /wx/user/auth
7. 人脸识别 /tencent/ocr/analysis
# confirmOrder.js
8. 根据订单id获取订单信息 /wx/order
9. 根据精华订单id查询精华课程信息 /wx/ticketOrder
10. 获取微信支付参数-普通课程 /wx/pay/createOrder
11. 获取微信支付参数-训练营 /wx/pay/createCampOrder
12. 获取微信支付参数-公开年卡 /wx/pay/createVipOrder
13. 获取微信支付参数-精华年卡 /wx/pay/createEssenceOrder
14. 校验是否认证过(老学员) /wx/auth/check
15. 是否老学员 /wx/oldUser/check
16. 获取优惠券 /wx/coupon
# dayUpdate.js
17. 获取财经六点半课程详情 /wx/courses/info?cid=${cid}
课程id=224
# detail.js
18. 获取课程详细信息 /wx/courses/${id}/step
id是课程id
19. 创建预支付订单 /wx/createOrder
20. 创建拼团预支付订单 /wx/pay/createPinkOrder
21. 生成海报接口 /wx/poster/generate/${cid}
22. 获取新的token /wx/aes 加密token
23. 获取手机短信验证码 /aliyun/send/${phone}
24. 提交短信验证码 /aliyun/verify
25. 添加分享统计 /wx/shareLog
# edite.js
26. 修改用户信息 /wx/user/info
请求方式 patch
27. 查询用户信息 /wx/user/info
请求方式 get
# groupBuy.js
28. 首页数据 /wx/pink/courses
获取所有拼团课程
29. 根据团id查询团信息 /wx/pink/info
# home.js
30. 首页数据 /wx/courses/index
首页列表 - 轮播图，日更，首页卡包课程分类
31. 首页数据 /wx/courses/activity
首页活动列表
# information.js
32. 获取资讯列表 /wx/article
文章列表
33. 获取资讯详情 /wx/article/${id}
文章详情
34. 获取资讯评论 /wx/articleComment
文章评论
35. 获取资讯评论详情 /wx/articleComment
文章评论详情
# live.js
36 首页数据 /wx/liveBroadcast
直播
# mediaPlayer.js
37. 获取课程评论列表 /wx/coursesComment
get
38. 课程评论列表增加 /wx/coursesComment
post
# more.js
39. 根据分类 /wx/courses/category
根据课程分类id查询课程列表
40. 首页搜索 /wx/courses/search
根据关键字搜索课程信息
# my.js
41. 根据用户id获取已购买课程 /wx/user/my
42. 根据分享人unionid查询被分享人用户信息 /wx/my/invite
43. 校验运营商身份 /wx/user/check 
44. 获取签到二维码 /wx/ticket/qrcode
45. 获取邀约人信息 /wx/inviteInfo
获取当前用户的邀约人信息
# question.js
46. 获取调查问卷 /wx/vote/1
47. 提交调查问卷 /wx/voteValue
48. 获取会议列表接口 ${process.env.VUE_APP_BASE_API_BSH}/api/online/onLineMeetList
49. 获取会议明细接口 ${process.env.VUE_APP_BASE_API_BSH}/api/online/meetDetail
50. 判断是否填写过调查问卷 /wx/vote/checkVote
51. 会议报名接口 /wx/ticket/onLineSignUp
# receive.js
52. 免费领取 /wx/receiveLog
53. 获取领取课程详情 /wx/gift/${id}
# user.js
54. 登录接口 /wx/login
55. 获取登录用户信息 /user/get_user
# yearcard.js
56. 获取年卡列表 /wx/coursesCategory?type=${type}
57. 获取用户是否关注公众号 /wx/subscribe
校验是否关注公众号
58. 获取卡包详情信息 /wx/vipCard/${id}
59. 获取博士会uniId ${process.env.VUE_APP_BASE_API_BSH}/api/member/onLineInvitationCheck
60. 下订单接口 /wx/pay/createVipOrder
61. 获取二维码接口 /wx/qyWx
62. 获取小白训练营详细信息 /wx/camp/${id}
63. 精华会议订单 /wx/pay/createEssenceOrder
购买精华会议 BSH_URL + "/meet/ticket/onLineBuyGeneralTicket
64. 获取小白训练营详细信息 /wx/camp










