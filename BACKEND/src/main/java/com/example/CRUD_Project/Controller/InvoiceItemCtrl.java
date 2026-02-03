package com.example.CRUD_Project.Controller;

import com.example.CRUD_Project.Repo.InvoiceItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class InvoiceItemCtrl {
}
@Autowired
private InvoiceItemRepo invoiceItemRepo;

@PostMapping("/addItems/{id}")
public ResponseEntity<?> addItems(@PathVariable Long id, @RequestBody InvoiceItem i){
    var user= itemRepo.findById(i.getId()).orElseThrow(()-> new RuntimeException("Invoice Id not found"));
    itemRepo.save(i);
    return new ResponseEntity<>("Saved Successfully", HttpStatus.OK);
}

@GetMapping("/getItems")
public ResponseEntity<?> getItems(){
    return new ResponseEntity<>(itemRepo.findAll(), HttpStatus.OK);
}

@PutMapping("updateItems/{id}")
public ResponseEntity<?> updateItems(@PathVariable Long id, @RequestBody InvoiceItem i ){
    var user= itemRepo.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));
    user.setQty(i.getQty());
    return new ResponseEntity<>("Update successful",HttpStatus.OK);
}

@DeleteMapping("/delete/{id}")
public ResponseEntity<?> deleteItems(@PathVariable Long id){
    itemRepo.deleteById(id);
    return new ResponseEntity<>("delete successful",HttpStatus.OK);

}
