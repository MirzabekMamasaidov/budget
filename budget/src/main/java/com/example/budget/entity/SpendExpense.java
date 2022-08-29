package com.example.budget.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Spend_Expense")
public class SpendExpense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "expense_id")
    private Integer  expenseId;
    private Float amount;
    private String title;
    private  String description;
    private String category;
    private Timestamp date;
    @OneToMany(cascade = CascadeType.REMOVE)
    private List<BudgetMember> budgetMember;
}
