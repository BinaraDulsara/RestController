package lk.ijse.restcontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("character")
public class CharacterMappingController {

    //item/I333
    //item/Ivff
    //item/I001


    @GetMapping(path = "iteam/i???")
    public String test(){
        return "Get Mapping Invoked (test) ";
    }

/*
    @GetMapping(path = "")
    public String test2(){
        return "Get Mapping Invoked (test2)";
    }
*/

}
