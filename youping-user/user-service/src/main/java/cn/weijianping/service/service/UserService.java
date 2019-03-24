package cn.weijianping.service.service;

import cn.weijianping.service.pojo.User;

/**
 * @author itmrchen
 * @date 2019/3/24 17:38
 * @desc ctrate by YUE XIA
 */
public interface UserService {

    /**
     * 添加一个用户
     * @param user
     * @return 返回添加后的用户（带主键）
     */
    User add (User user);

    /**
     * 根据用户id查询用户信息
     * @param userId
     * @return
     */
    User findByid(String userId);

    /**
     * 更新用户
     * @param user
     * @return 返回更新后的用户信息
     */
    User updata(User user);
}
