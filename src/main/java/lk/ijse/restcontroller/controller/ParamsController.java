package lk.ijse.restcontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params")
public class ParamsController {

    //http://localhost:8080/RestController_war_exploded/params/one?id=003
    // Start with ?
    // id=C001&name=dulz  ---> query params

    @GetMapping(params = {"id","name"})
    public String test1(String id,String name){
        return " Hello 1 " +id+" : "+name ;
    }


    @GetMapping(path = "one",params = {"id"})
    public String test2(String id){
        return " Hello 2  " + id ;
    }


    @GetMapping(params = {"name","salary"})
    public String test3( String name ,@RequestParam ("salary")double mySalary){
        return " Hello 3 " + name + " "+mySalary ;
    }



}
