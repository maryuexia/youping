package cn.weijianping.youpingcommon.exception;

import cn.weijianping.youpingcommon.enums.ResultEnum;

/**
 * @author itmrchen
 * @date 2019/3/20 0020 上午 9:41
 * @desc ctrate by YUE XIA
 */
public class YoupintException extends RuntimeException{

    private Integer code;

    public YoupintException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public YoupintException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
