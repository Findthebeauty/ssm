package cool.shepherdboy.controller;

import cool.shepherdboy.pojo.User;
import cool.shepherdboy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ShepherdBoy
 * @createTime 2022-10-22 10:25
 * @update: [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
//@Controller
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    public static final int PAGE_ROW_COUNT = 5;

    @Autowired
    UserService userService;

    @RequestMapping("/selectUserPage")
//    @ResponseBody
    public List<User> selectUserPage(String userName,
                                     String userSex,
                                     Integer page,
                                     Integer rowCount) {

        int startRow = 0;


        if (rowCount == null)
            rowCount = PAGE_ROW_COUNT;

        if(page != null)
            startRow = (page - 1) * rowCount;

        return userService.selectUserPage(userName, userSex, startRow, rowCount);
    }

    @RequestMapping("/getRowCount")
//    @ResponseBody
    public int getRowCount(String userName, String userSex) {

        return userService.getRowCount(userName, userSex);
    }

    @RequestMapping("/deleteUserById")
//    @ResponseBody
    public int deleteUserById(String userId) {

        return userService.deleteUserById(userId);
    }

    @RequestMapping("/createUser")
//    @ResponseBody
    public int createUser(User user) {
        String userId = System.currentTimeMillis() + "";
        user.setUserId(userId);

        return userService.createUser(user);
    }

}
