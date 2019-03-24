package cn.weijianping.service.service.impl;

import cn.weijianping.service.mapper.UserMapper;
import cn.weijianping.service.pojo.User;
import cn.weijianping.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author itmrchen
 * @date 2019/3/24 17:43
 * @desc ctrate by YUE XIA
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public User add(User user) {
        userMapper.insert(user);
        return user;
    }

    @Override
    public User findByid(String userId) {
        User user = userMapper.selectById(userId);
        return user;
    }

    @Override
    public User updata(User user) {
        userMapper.updateById(user);
        return user;
    }
}
