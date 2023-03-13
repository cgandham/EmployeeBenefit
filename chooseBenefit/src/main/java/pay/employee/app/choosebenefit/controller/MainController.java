package pay.employee.app.choosebenefit.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/webapp")
public class MainController {

    @GetMapping(path="/home")
    public @ResponseBody String home() {
        return  "Welcome !!";
    }

}
