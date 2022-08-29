package com.example.budget.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "plan_has_goal")
public class PlanHasGoal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private PlanBudgetPlan planBudgetPlan;

    @OneToOne
    private SetBudgetGoal setBudgetGoal;

}
