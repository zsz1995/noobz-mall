package com.noobz.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.noobz.entity.UserEntity;
import com.noobz.facade.UserService;
import com.noobz.req.user.LoginReq;
import com.noobz.resp.Result;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author zhousz
 * @date 2020/5/20 11:28
 */
@RestController
public class UserControllerImpl implements UserController {

  @Reference(version = "1.0.0")
  private UserService userService;


  @Override
  public Result login(LoginReq loginReq, HttpServletResponse httpRsp) {
    UserEntity userEntity = userService.login(loginReq);
    return Result.newSuccessResult(userEntity);
  }
}
