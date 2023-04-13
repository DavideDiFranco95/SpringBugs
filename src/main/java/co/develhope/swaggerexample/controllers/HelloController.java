package co.develhope.swaggerexample.controllers;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping(value = "")
    @ApiOperation(tags = {"Hello"},value= "Says hello", notes = "Prints out the Hello message for the user")
    public String sayHello(){
        return "Hello my dear!";
    }
}
