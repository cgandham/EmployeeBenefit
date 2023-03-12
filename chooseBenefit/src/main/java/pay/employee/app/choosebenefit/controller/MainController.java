package pay.employee.app.choosebenefit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/webapp")
public class MainController {

    @GetMapping(path="/home")
    public @ResponseBody String home() {
        return  "Welcome !!";
    }

}
