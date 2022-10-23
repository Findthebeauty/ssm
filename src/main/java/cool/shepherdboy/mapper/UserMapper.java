package cool.shepherdboy.mapper;

import cool.shepherdboy.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ShepherdBoy
 * @createTime 2022-10-21 19:58
 */
public interface UserMapper {

    List<User> selectUserPage(
            @Param("userName")
            String userName,
            @Param("userSex")
            String userSex,
            @Param("startRow")
            int startRow,
            @Param("rowCount")
            int rowCount);

    int createUser(User user);

    int deleteUserById(String userId);

    int getRowCount(
            @Param("userName")
            String userName,
            @Param("userSex")
            String userSex);

    User getUserByName(String userName);

    User getUserById(String userId);
}
