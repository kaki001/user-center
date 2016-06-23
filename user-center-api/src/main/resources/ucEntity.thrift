/** entity类型, service会引用 */
include "ucEnums.thrift"
namespace java com.geh.uc.api.entity


/** 用户登录的请求 */
 struct UserLoginReq {
     /** 用户名 */
     1: required string username,
     /** 密码 */
     2: optional string password,
 }

/** 用户登录的返回 */
struct UserLoginRes {
    /** 处理代码:0-成功; 大于0-失败 */
    1: required i32 code = 0,
    /** 提示消息，一般成功时候为空 */
    2: required string message = "",
    /** 用户的访问令牌 */
    3: required string token,
}