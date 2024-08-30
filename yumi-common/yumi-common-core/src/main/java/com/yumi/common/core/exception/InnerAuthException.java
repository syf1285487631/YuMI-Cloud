package com.yumi.common.core.exception;

/**
 * 内部认证异常
 * 
 * @author yumi
 */
public class InnerAuthException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public InnerAuthException(String message)
    {
        super(message);
    }
}
