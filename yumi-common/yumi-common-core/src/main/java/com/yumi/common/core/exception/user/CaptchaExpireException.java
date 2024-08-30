package com.yumi.common.core.exception.user;

import com.yumi.common.core.exception.user.UserException;

/**
 * 验证码失效异常类
 * 
 * @author yumi
 */
public class CaptchaExpireException extends UserException
{
    private static final long serialVersionUID = 1L;

    public CaptchaExpireException()
    {
        super("user.jcaptcha.expire", null);
    }
}
