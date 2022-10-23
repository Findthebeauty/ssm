package cool.shepherdboy.service;

import cool.shepherdboy.pojo.User;

import java.util.List;

/**
 * @author ShepherdBoy
 * @createTime 2022-10-21 21:49
 */
public interface UserService {

    List<User> selectUserPage(String userName, String userSex, int startRow, int rowCount);

    int createUser(User user);

    int deleteUserById(String userId);

    int getRowCount(String userName, String userSex);

    User getUserByName(String userName);

    User getUserById(String userId);

}
