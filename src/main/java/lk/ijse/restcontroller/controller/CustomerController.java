package lk.ijse.restcontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//REST = Reprasantational state transfer (Architecture ek)
@RestController
@RequestMapping("customer")
public class CustomerController {



    @GetMapping
    public String getAllCustomer(){
        return " Hello there !!! ";
    }

    @PostMapping
    public String saveCustomer(){
        return "Customer save and post method invoke";
    }

}
