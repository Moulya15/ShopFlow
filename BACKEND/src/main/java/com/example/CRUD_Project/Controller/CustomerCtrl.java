package com.example.CRUD_Project.Controller;
import com.example.CRUD_Project.Entity.Customer;
import com.example.CRUD_Project.Repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class CustomerCtrl {
    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping("/save")
    public ResponseEntity<?> saveInfo(@RequestBody Customer c){
        if(customerRepo.existsByMobile(c.getMobile())){
            throw new RuntimeException("Number already exists");
        }
        customerRepo.save(c);
        return new ResponseEntity<>("welcome"+c.getName(), HttpStatus.OK);
    }

    @GetMapping("/getAllInfo")
    public ResponseEntity<?> getInfo(){
        return new ResponseEntity<>(customerRepo.findAll(),HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateInfo(@PathVariable Long id, @RequestBody Customer c) {
        var checkUser = customerRepo.findById(id).orElseThrow(() -> new RuntimeException("No customer Found"));
        if (c.getName()!= null) checkUser.setName(c.getName());
        if (c.getAddress() != null) checkUser.setAddress(c.getAddress());
        if(customerRepo.existsByMobile(c.getMobile())){
            if (c.getMobile() != null) checkUser.setMobile(c.getMobile());
        }
        if (c.getEmail()!=null) checkUser.setEmail(c.getEmail());
        customerRepo.save(checkUser);
        return new ResponseEntity<>("updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id){
        customerRepo.deleteById(id);
        return new ResponseEntity<>("Deleted ",HttpStatus.OK);
    }
}
