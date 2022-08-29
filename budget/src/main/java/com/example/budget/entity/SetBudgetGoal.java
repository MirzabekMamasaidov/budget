package com.example.budget.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Set_Budget_Goal")
public class SetBudgetGoal  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "budget_goal_id")
    private Integer budgetGoalId;
    @Column(name = "amount_Saved")
    private Float amountSaved;
    private String name;
    private String description;
    @Column(name = "start_date")
    private Timestamp startDate;
    @Column(name = "end_date")
    private Timestamp endDate;
    @OneToOne(cascade = CascadeType.REMOVE)
    private BudgetMember budgetMember;
}
