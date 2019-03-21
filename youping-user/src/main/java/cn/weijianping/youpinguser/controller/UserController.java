package cn.weijianping.youpinguser.controller;

import cn.weijianping.youpingcommon.reult.ResultVo;
import cn.weijianping.youpingcommon.reult.ResultVoUtil;
import cn.weijianping.youpinguser.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户")
@RestController
public class UserController {

    @ApiOperation("根据id获取详细信息")
    @GetMapping("/get_info/{id}")
    public ResultVo getInfo(@PathVariable("id") String id){

        return ResultVoUtil.success(User.builder()
                .id(id)
                .email("yuexia@weijianping.cn")
                .name("月下")
                .password("123456")
                .password("88888888")
                .build());
    }

    @ApiOperation("注册一个用户")
    @PostMapping("/create")
    public ResultVo create(@RequestBody User user){
        return ResultVoUtil.success();
    }
}
