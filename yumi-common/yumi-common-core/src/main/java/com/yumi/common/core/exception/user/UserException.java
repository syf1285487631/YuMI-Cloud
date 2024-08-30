package com.yumi.common.core.exception.user;

import com.yumi.common.core.exception.base.BaseException;

/**
 * 用户信息异常类
 * 
 * @author yumi
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
