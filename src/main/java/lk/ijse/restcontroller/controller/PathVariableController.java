package lk.ijse.restcontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("variable")
public class PathVariableController {

    //http://localhost:8080/restcontroller/bariable/I001

    //(variable) path segments
    //(i001)     path segments

    //IN SPRING WE CAN RETRIEVE VALUE OF PATH SEGMENTS
    //TO DO THAT WE HAVE TO CREATE PATH VARIABLES ----> {Ioo1}


    @GetMapping(path = "{id:[I][0-9]{3}}")
    public String test(@PathVariable ("id") String id){
        return id;
    }

    @GetMapping(path =  "{id:[C][0-9]{3}}")
    public String test3(@PathVariable ("id") String id){
        return id;
    }

    @GetMapping(path = "{CustomerId}/{CustomerName}") //setting alies when parameters names and variable names differ
    public String test2(@PathVariable ("CustomerId") String id, @PathVariable ("CustomerName") String name){
        return id +" "+name;
    }


}
