package com.example.budget.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Assistant_Location")
public class AssistantLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "postal_code")
    private  String postalCode;
    private String country;
}
