package com.noobz.facade;

import com.noobz.entity.UserEntity;
import com.noobz.req.user.LoginReq;

/**
 * 公用UserService
 *
 * @author zhousz
 * @date 2020/5/20  10:12
 */
public interface UserService {

  public UserEntity login(LoginReq loginReq);

}
