package com.example.budget.controller;


import com.example.budget.dao.Apiresponse;
import com.example.budget.entity.BudgetMember;
import com.example.budget.payload.BudgetMemberDto;
import com.example.budget.payload.BudgetPlanDto;
import com.example.budget.repository.BudgetMemberRepository;
import com.example.budget.service.BudgetMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/budgetMember")
public class BudgetMemberController {

    final BudgetMemberRepository budgetMemberRepository;
    final BudgetMemberService service;
    @GetMapping
    @PreAuthorize(value = "hasAnyAuthority('ADMINISTRATOR','BUDGET_MEMBER')")
    public Apiresponse getAll(){
        List<BudgetMember> all = budgetMemberRepository.findAll();
        return new Apiresponse("All",true,all);

    }
    @GetMapping("/{id}")
    @PreAuthorize(value = "hasAnyAuthority('ADMINISTRATOR','BUDGET_MEMBER')")
    public Apiresponse getOne( @PathVariable Integer id){
        return service.getOne(id);
    }

    @PostMapping
    @PreAuthorize(value = "hasAuthority('ADMINISTRATOR')")
    public Apiresponse create(@RequestBody BudgetMemberDto dto){

        return service.create(dto);
    }


    @PutMapping("/{id}")
    @PreAuthorize(value = "hasAuthority('ADMINISTRATOR')")

    public Apiresponse update(@PathVariable Integer id, @RequestBody BudgetMemberDto dto){
        return service.update(id,dto);
    }


    @PreAuthorize(value = "hasAuthority('ADMINISTRATOR')")
    @DeleteMapping("/{id}")
    public Apiresponse delete(@PathVariable Integer id){
        return service.delete(id);
    }

}
