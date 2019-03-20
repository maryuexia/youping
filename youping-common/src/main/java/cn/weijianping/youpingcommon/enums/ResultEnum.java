package cn.weijianping.youpingcommon.enums;


import lombok.Getter;

/**
 * @author itmrchen
 * @date 2019/3/20 0020 上午 9:43
 * @desc ctrate by YUE XIA
 */
@Getter
public enum ResultEnum {


    SUCCESS(0,"成功"),
    PARAM_ERROR(1,"参数不正确"),
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
