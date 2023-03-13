package pay.employee.app.choosebenefit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pay.employee.app.choosebenefit.Service.IUserService;
import pay.employee.app.choosebenefit.helpers.UserHelper;
import pay.employee.app.choosebenefit.model.Paycheck;
import pay.employee.app.choosebenefit.model.User;

import java.util.List;

@RestController
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private UserHelper helper;


    @PostMapping(path = "/add")
    public @ResponseBody String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "User added with role: " + user.getRole();
    }

    @GetMapping(path="/getAll")
    public @ResponseBody List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path="/get")
    public @ResponseBody User getUser(@RequestParam int userId) {
        return userService.getUser(userId);
    }

    @GetMapping(path = "/getPaycheck")
    public @ResponseBody Paycheck getPaycheck(@RequestParam int userId) {
        return helper.getPaycheck(userId);
    }

    @GetMapping(path = "/getAllEmployeePaychecks")
    public @ResponseBody List<Paycheck> getEmployeePaycheck() {
        return helper.getAllEmployeePaychecks();
    }



}
