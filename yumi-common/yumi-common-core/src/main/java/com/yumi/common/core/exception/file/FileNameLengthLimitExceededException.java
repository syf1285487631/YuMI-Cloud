package com.yumi.common.core.exception.file;

import com.yumi.common.core.exception.file.FileException;

/**
 * 文件名称超长限制异常类
 * 
 * @author yumi
 */
public class FileNameLengthLimitExceededException extends FileException
{
    private static final long serialVersionUID = 1L;

    public FileNameLengthLimitExceededException(int defaultFileNameLength)
    {
        super("upload.filename.exceed.length", new Object[] { defaultFileNameLength }, "the filename is too long");
    }
}
