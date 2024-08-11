package com.spring.WalletWise.controller;

import com.spring.WalletWise.dto.IncomeDTO;
import com.spring.WalletWise.entity.Income;
import com.spring.WalletWise.services.income.IncomeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.mbeans.SparseUserDatabaseMBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/income")
@RequiredArgsConstructor
@CrossOrigin("*")
public class IncomeController {

    private final IncomeService incomeService;

    @PostMapping
    public ResponseEntity<?> postIncome(@RequestBody IncomeDTO dto){
        Income createdIncome = incomeService.postIncome(dto);
        if(createdIncome != null){
            return ResponseEntity.status(HttpStatus.CREATED).body(createdIncome);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllIncome(){
        return ResponseEntity.ok(incomeService.getAllIncome());
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateIncome(@PathVariable Long id,@RequestBody IncomeDTO incomeDTO){
        try{
            return ResponseEntity.ok(incomeService.updateIncome(id, incomeDTO));
        }catch (EntityNotFoundException ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getIncomeById(@PathVariable Long id){
        try{
            return ResponseEntity.ok(incomeService.getIncomeById(id));
        }catch (EntityNotFoundException ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteIncome(@PathVariable Long id){
        try{
            incomeService.deleteIncome(id);
           return ResponseEntity.ok(null);
        }catch (EntityNotFoundException ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        }
    }
}
