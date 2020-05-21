package com.noobz.exception;

import java.io.Serializable;

/**
 * 通用业务异常（由异常状态码区分不同的业务异常）
 *
 * @author zhousz
 * @date 2020/5/20 11:23
 */
public class CommonBizException extends RuntimeException implements Serializable {

  private ExpCodeEnum codeEnum;

  public CommonBizException(ExpCodeEnum codeEnum) {
    super(codeEnum.getMessage());
    this.codeEnum = codeEnum;
  }

  public CommonBizException() {
  }

  public ExpCodeEnum getCodeEnum() {
    return codeEnum;
  }

}
