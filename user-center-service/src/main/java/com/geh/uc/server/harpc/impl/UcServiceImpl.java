package com.geh.uc.server.harpc.impl;

import com.geh.uc.api.entity.UserLoginReq;
import com.geh.uc.api.entity.UserLoginRes;
import com.geh.uc.api.service.UcService;
import org.apache.thrift.TException;

/**
 * Created by HuoBi on 2016/6/18.
 */
public class UcServiceImpl implements UcService.Iface {

    /**
     * 用户登录接口
     *
     * @param req
     */
    @Override
    public UserLoginRes userLogin(UserLoginReq req) throws TException {
        return null;
    }
}
