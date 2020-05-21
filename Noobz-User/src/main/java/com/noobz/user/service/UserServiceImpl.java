package com.noobz.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.noobz.entity.UserEntity;
import com.noobz.facade.UserService;
import com.noobz.req.user.LoginReq;

/**
 * @author zhousz
 * @date 2020/5/20 10:29
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

  @Override
  public UserEntity login(LoginReq loginReq) {
    return null;
  }
}
