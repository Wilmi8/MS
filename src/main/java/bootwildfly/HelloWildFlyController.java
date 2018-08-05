package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("Malschauen, was das tool so kann");
    }
    @RequestMapping("jost")
    public String sayHello(){
        return ("hallo jost, das geht nun beides");
    }
}
