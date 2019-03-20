package cn.weijianping.youpingcommon.reult;

/**
 * @author itmrchen
 * @date 2019/3/20 0020 上午 10:02
 * @desc ctrate by YUE XIA
 */
public class ResultVoUtil {
    public static ResultVo success(Object obj){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        resultVo.setData(obj);
        return resultVo;
    }

    public static ResultVo success(){
        return success(null);
    }

    public static ResultVo rerror(Integer code,String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }
}
