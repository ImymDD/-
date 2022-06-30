package user.service;

import user.bean.UserInfo;

import java.util.List;


public interface UserService {

    void addUser(UserInfo userInfo);

    List<UserInfo> allUsers();
}
