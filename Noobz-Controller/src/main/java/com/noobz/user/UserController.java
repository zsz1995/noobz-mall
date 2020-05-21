package com.noobz.user;

import com.noobz.req.user.LoginReq;
import com.noobz.resp.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author zhousz
 * @date 2020/5/20 11:16
 */
@RestController
public interface UserController {

  /**
   * 登录
   *
   * @param loginReq 登录请求参数
   * @param httpRsp Http 响应
   * @return com.noobz.resp.Result
   * @throws
   * @author zhousz
   * @date 2020/5/20  11:27
   */
  @GetMapping("/login")
  Result login(LoginReq loginReq, HttpServletResponse httpRsp);


}
