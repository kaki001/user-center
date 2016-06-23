package com.geh.uc.server.service;

import com.geh.uc.api.entity.UserLoginReq;
import com.geh.uc.api.entity.UserLoginRes;
import org.apache.thrift.TBase;
import org.springframework.stereotype.Service;

/**
 * Created by Ge Hui on 2016/6/18.
 */
@Service
public class UserLoginService implements IService<UserLoginRes, UserLoginReq> {

    @Override
    public UserLoginRes excecute(UserLoginReq req) {
        return null;
    }
}
