package com.example.CRUD_Project.Controller;

import com.example.CRUD_Project.Entity.Customer;
import com.example.CRUD_Project.Entity.Invoice;
import com.example.CRUD_Project.Repo.InvoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoice")
@CrossOrigin("*")
public class InvoiceCtrl {
    @Autowired
    private InvoiceRepo invoiceRepo;

//the invoice is generated once the users have added items in the invoice items.


//    @PostMapping("/save")
//    public ResponseEntity<?> saveInfo(@RequestBody Customer c){
//        if(invoiceRepo.get(c.getMobile())){
//            throw new RuntimeException("Number already exists");
//        }
//        invoiceRepo.save(c);
//        return new ResponseEntity<>("welcome"+c.getName(), HttpStatus.OK);
//    }
//
//    @GetMapping("/getAllInfo")
//    public ResponseEntity<?> getInfo(){
//        return new ResponseEntity<>(invoiceRepo.findAll(),HttpStatus.OK);
//    }
//
//    @PutMapping("/update/{id}")
//    public ResponseEntity<?> updateInfo(@PathVariable Long id, @RequestBody Customer c) {
//        var checkUser = invoiceRepo.findById(id).orElseThrow(() -> new RuntimeException("No customer Found"));
//        if (c.getName()!= null) checkUser.setName(c.getName());
//        if (c.getAddress() != null) checkUser.setAddress(c.getAddress());
//        if(invoiceRepo.existsByMobile(c.getMobile())){
//            if (c.getMobile() != null) checkUser.setMobile(c.getMobile());
//        }
//        if (c.getEmail()!=null) checkUser.setEmail(c.getEmail());
//        return .save(checkUser);
//        return new ResponseEntity<>("updated successfully", HttpStatus.OK);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> deleteUser(@PathVariable Long id){
//        invoiceRepo.deleteById(id);
//        return new ResponseEntity<>("Deleted ",HttpStatus.OK);
//    }
}
