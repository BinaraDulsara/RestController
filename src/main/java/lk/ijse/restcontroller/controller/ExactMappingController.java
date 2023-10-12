package lk.ijse.restcontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class ExactMappingController {

    //Exact Mapping = .....item/it/test1
    //Exact Mapping = .....item/test2/i0/tt1
    //path segment  = --> /it/

    @GetMapping(path = "it/test1")
    public String test(){
        return "Get Mapping Invoked (test) ";
    }

    @GetMapping(path = "test2/i0/tt1")
    public String test2(){
        return "Get Mapping Invoked (test2)";
    }

}
