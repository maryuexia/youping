package cn.weijianping.youpingcommon.reult;

import lombok.Data;

/**
 * @author itmrchen
 * @date 2019/3/20 0020 上午 9:50
 * @desc ctrate by YUE XIA
 */
@Data
public class ResultVo<T>{
    private Integer code;
    private String msg;
    private T data;


}
