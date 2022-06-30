package user.service.impl;

import user.bean.UserInfo;
import user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void addUser(UserInfo userInfo) {
        userMapper.insertSelective(userInfo);
    }

    @Override
    public List<UserInfo> allUsers() {
        return  userMapper.selectAll();
    }
}
