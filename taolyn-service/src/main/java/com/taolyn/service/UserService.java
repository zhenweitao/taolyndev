package com.taolyn.service;

import com.taolyn.pojo.Stu;
import com.taolyn.pojo.Users;
import com.taolyn.pojo.bo.UserBO;

/**
 * Created by 陶Lyn
 * on 2020/11/25.
 */
public interface UserService {
    boolean queryUsernameIsExist(String username);

    Users createUser(UserBO userBO);


    /**
     * 检索用户名和密码是否匹配，用于登录
     */
    public Users queryUserForLogin(String username, String password);
}
