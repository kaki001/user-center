/** 公共服务接口 */
include "ucEntity.thrift"
include "ucException.thrift"

namespace java com.geh.uc.api.service

/** 用户业务接口服务 */
service UcService {

    /** 用户登录接口 */
    ucEntity.UserLoginRes userLogin(1: ucEntity.UserLoginReq req);

}

