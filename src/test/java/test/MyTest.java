package test;

import cool.shepherdboy.mapper.UserMapper;
import cool.shepherdboy.pojo.User;
import cool.shepherdboy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author ShepherdBoy
 * @createTime 2022-10-21 22:00
 */

@RunWith(SpringJUnit4ClassRunner.class)//启动spring容器
@ContextConfiguration({"classpath:applicationContext_mapper.xml",
        "classpath:applicationContext_service.xml"})
public class MyTest {

    @Autowired
    UserService userService;

    @Test
    public void testSelectUserPage() {

        List<User> users = userService.selectUserPage("张三", "男", 0, 20);
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void testCreateUser() {

        int i = userService.createUser(new User("1", "身份证", "500101199501024422", "钟境鸿", "男", "27", "用户"));
        System.out.println(i);
    }

    @Test
    public void testDeleteUserById() {

        int i = userService.deleteUserById("1");
        System.out.println(i);
    }

    @Test
    public void testGetRowCount() {

        int rowCount = userService.getRowCount(null, "女");
        System.out.println(rowCount);
    }

    @Test
    public void testGetUserByName() {

        User user = userService.getUserByName("张三");
        System.out.println(user);
    }
    @Test
    public void testGetUserById() {

        User user = userService.getUserById("15968165113694372");
        System.out.println(user);
    }
}
