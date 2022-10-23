package cool.shepherdboy.service.impl;

import cool.shepherdboy.mapper.UserMapper;
import cool.shepherdboy.pojo.User;
import cool.shepherdboy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ShepherdBoy
 * @createTime 2022-10-21 21:53
 * @update: [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectUserPage(String userName, String userSex, int startRow, int rowCount) {
        return userMapper.selectUserPage(userName, userSex, startRow, rowCount);
    }

    @Override
    public int createUser(User user) {
        return userMapper.createUser(user);
    }

    @Override
    public int deleteUserById(String userId) {
        return userMapper.deleteUserById(userId);
    }

    @Override
    public int getRowCount(String userName, String userSex) {
        return userMapper.getRowCount(userName, userSex);
    }

    @Override
    public User getUserByName(String userName) {
        return userMapper.getUserByName(userName);
    }

    @Override
    public User getUserById(String userId) {
        return userMapper.getUserById(userId);
    }
}
