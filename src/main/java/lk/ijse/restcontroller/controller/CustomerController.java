package lk.ijse.restcontroller.controller;

import org.springframework.web.bind.annotation.*;

//REST = Reprasantational state transfer (Architecture ek)
@RestController
@RequestMapping("customer")//Handler Mapping


public class CustomerController {

    @GetMapping //Handler Mapping
    public String getAllCustomer(){ //Handler Methods
        return "Get all Customer and Get method invoked";
    }

    @GetMapping(path="search") //Handler Mapping
    public String SearchCustomer(){ //Handler Methods
        return "Search Customer and Get method invoked";
    }

    @GetMapping(path="newId") //Handler Mapping
    public String genarateNewId(){ //Handler Methods
        return "new Customer id and Get method invoked";
    }


    @PostMapping//Handler Mapping
    public String saveCustomer(){ //Handler Methods
        return "Customer save and post method invoked";
    }

    @DeleteMapping//Handler Mapping
    public String deleteCustomer(){ //Handler Methods
        return "Customer deleted and delete method invoked";
    }

    @PutMapping//Handler Mapping
    public String updateCustomer(){ //Handler Methods
        return "Customer updated nd Put method invoked";
    }

}
