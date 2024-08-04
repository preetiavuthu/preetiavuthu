package API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld

@RequestMapping(value = "/helo")
  public string sayhello() {

    return "Hllo World" ;
}
