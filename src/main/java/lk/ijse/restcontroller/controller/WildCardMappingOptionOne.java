package lk.ijse.restcontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("one")
public class WildCardMappingOptionOne {


    //wildcard mapping - matches one more character in a path segment

    //test/*/hello --> test//hello (not matching)
    //test/*/hello --> test/a/b/hello (not matching)

    //test/*/hello --> test/a/hello (matching)
    //test/*/hello --> test/abc/hello  (matching)


    @GetMapping(path = "test/*/hello")
    public String test(){
        return "Get Mapping Invoked (test) ";
    }


    @GetMapping(path = "hello/*/*")
    public String test2(){
        return "Get Mapping Invoked (test2)";
    }

}
