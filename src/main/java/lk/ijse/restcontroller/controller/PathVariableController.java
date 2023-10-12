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


    @GetMapping(path = "{id}")
    public String test(@PathVariable ("id") String itemCode){
        return itemCode;
    }

    @GetMapping(path = "{CustomerId}/{CustomerName}") //alies
    public String test2(@PathVariable ("CustomerId") String id, @PathVariable ("CustomerName") String name){
        return id +" "+name;
    }


}
