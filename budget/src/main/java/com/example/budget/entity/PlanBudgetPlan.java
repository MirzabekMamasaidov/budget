package com.example.budget.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Plan_Budget_Plan")
public class PlanBudgetPlan implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "budget_plan_id")
    private Integer budgetPlanId;
    @OneToOne(cascade = CascadeType.REMOVE)
    private BudgetMember budgetMember;
    private String name;
    private String description;
    @Column(name = "start_date")
    private Timestamp startDate;
    @Column(name = "end_date")
    private Timestamp endDate;


}
