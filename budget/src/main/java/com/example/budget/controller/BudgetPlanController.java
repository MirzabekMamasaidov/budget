package com.example.budget.controller;


import com.example.budget.dao.Apiresponse;
import com.example.budget.payload.BudgetGoalDto;
import com.example.budget.payload.BudgetPlanDto;
import com.example.budget.service.BudgetPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/budgetPlan")
public class BudgetPlanController {
final BudgetPlanService service;

    @GetMapping
    @PreAuthorize(value = "hasAnyAuthority('BUDGET_MEMBER','BUDGET_ASSISTANT')")
    public Apiresponse getAllBudgetPlans(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    @PreAuthorize(value = "hasAnyAuthority('BUDGET_MEMBER','BUDGET_ASSISTANT')")
    public Apiresponse getOne( @PathVariable Integer id){
        return service.getOne(id);
    }

    @PostMapping
    @PreAuthorize(value = "hasAnyAuthority('BUDGET_MEMBER','BUDGET_ASSISTANT')")
    public Apiresponse create(@RequestBody BudgetPlanDto dto){
        return service.create(dto);
    }
    @PutMapping("/{id}")
    public Apiresponse update(@PathVariable Integer id, @RequestBody BudgetPlanDto dto){
        return service.update(id,dto);
    }
    @PreAuthorize(value = "hasAnyAuthority('BUDGET_MEMBER','BUDGET_ASSISTANT')")
    @DeleteMapping("/{id}")
    public Apiresponse delete(@PathVariable Integer id){
        return service.delete(id);
    }
}
