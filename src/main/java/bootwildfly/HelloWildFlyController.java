package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("Und ich habe wieder was geändert");
    }
    @RequestMapping("jost")
    public String sayJost(){
        return ("hallo jost, das geht nun beides");
    }
    
    @RequestMapping("/hallo/{name}")
    String hallo(@PathVariable String name) {
         
             return "Hi "+name+" !";
              
    }
    
}
