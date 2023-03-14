package pay.employee.app.choosebenefit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pay.employee.app.choosebenefit.Service.IUserService;
import pay.employee.app.choosebenefit.helpers.UserHelper;
import pay.employee.app.choosebenefit.model.Dependent;
import pay.employee.app.choosebenefit.model.Paycheck;
import pay.employee.app.choosebenefit.model.User;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private UserHelper helper;


    @PostMapping(path = "/add")
    public @ResponseBody String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "User added with role: " + user.getRole() + " and id: " + user.getId();
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

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/getAllEmployeePaychecks")
    public @ResponseBody List<Paycheck> getEmployeePaycheck() {
        return helper.getAllEmployeePaychecks();
    }

    @PutMapping (path = "/update")
    public @ResponseBody String updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return "User added with id: " + user.getId();
    }

    @DeleteMapping (path = "/delete")
    public @ResponseBody String deleteUser(@RequestBody User user) {
        userService.deleteUser(user);
        return "User deleted with id: " + user.getId();
    }

    @PostMapping(path = "/addDependent")
    public @ResponseBody String addUser(@RequestBody Dependent dependent) {
        userService.addDependent(dependent);
        return "Dependent added of type: " + dependent.getType() + " for user id: " + dependent.getUserId();
    }


}
