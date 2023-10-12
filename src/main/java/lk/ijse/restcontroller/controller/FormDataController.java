package lk.ijse.restcontroller.controller;

import lk.ijse.restcontroller.dto.CustomerDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("form")

public class FormDataController {

    @PostMapping
    public String testForm1(@ModelAttribute CustomerDTO customerDTO){
        return "Request received "+ customerDTO.toString() ;
    }

}

