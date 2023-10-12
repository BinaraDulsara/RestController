package lk.ijse.restcontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("two")
public class WildCardMappingOptionTwo {


    //http://localhost:8080/appname/path/path2/path ---> (path segments)

    //wildcard mapping option two ---> matches 0 more character in a path segment until end of the path

    //test/**/hello --> test/hello ( matching)
    //test/**/hello --> test//hello ( matching)
    //test/**/hello --> test/a/hello (matching)
    //test/**/hello --> test/abc/abc/hello(matching)
    //test/**/hello --> test/abc/abc/abc/hello(matching)



    @GetMapping(path = "test/**/hello")
    public String test(){
        return "Get Mapping Invoked (test) ";
    }


}
