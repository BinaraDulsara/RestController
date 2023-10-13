package lk.ijse.restcontroller.controller;

import lk.ijse.restcontroller.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JSONController {

    @PostMapping
    public String getJsonRequest(@RequestBody CustomerDTO dto){
        return " Hello json " + dto.toString();
    }

    @GetMapping
    public CustomerDTO sendBackJson(){
       return new CustomerDTO("C001","Binara","wadduwa",100.00);
    }

    @GetMapping(path = "array")
    public ArrayList<CustomerDTO> sendBackJsonArray(){

        ArrayList<CustomerDTO> all = new ArrayList<>();

        all.add( new CustomerDTO("C001","Binara","wadduwa",100.00));
        all.add( new CustomerDTO("C002","dulz","thalpitiya",200.00));
        all.add( new CustomerDTO("C003","dezilva","panadura",300.00));


        return all;

    }


}
