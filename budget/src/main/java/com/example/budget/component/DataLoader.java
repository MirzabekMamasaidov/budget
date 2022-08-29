package com.example.budget.component;

import com.example.budget.entity.BudgetAssistant;
import com.example.budget.entity.BudgetMember;
import com.example.budget.entity.Role;
import com.example.budget.entity.User;
import com.example.budget.entity.roleEnum.RoleEnum;
import com.example.budget.repository.BudgetAssistantRepository;
import com.example.budget.repository.BudgetMemberRepository;
import com.example.budget.repository.RoleRepository;
import com.example.budget.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DataLoader implements CommandLineRunner {
    final PasswordEncoder passwordEncoder;

    @Value("${spring.sql.init.mode}")
    private String mode;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddl;

    final UserRepository userRepository;
    final BudgetMemberRepository budgetMemberRepository;
    final BudgetAssistantRepository budgetAssistantRepository;
    final RoleRepository roleRepository;
    @Override
    public void run(String... args) throws Exception {
      if(mode.equals("always") && ddl.equals("create")){
          User user =new User();
          user.setEmail("ruzimboykholmurotov@gmail.com");
          user.setUsername("royholms");
          user.setFirstName("Xolmurotov");
          user.setLastName("Ruzimboy");
          user.setPassword("123");
          Role role=new Role();
          role.setName("ADMINISTRATOR");
          roleRepository.save(role);
          user.setRole(role);
          userRepository.save(user);

          BudgetMember budgetMember =new BudgetMember();
          budgetMember.setEmail("wdefr");
          budgetMember.setPassword("123");
          Role role1 =new Role();
          role1.setName("BUDGET_MEMBER");
          roleRepository.save(role1);
          budgetMember.setRole(role1);
          budgetMember.setUsername("hello");
          budgetMember.setPassword("123");
          budgetMember.setEmail("email");
          budgetMember.setFirstName("Ruzimboy");
          budgetMember.setEmploymentPosition("asdfg");
          budgetMember.setPostalCode("1234");
          budgetMember.setLastName("Kholmurotov");
          budgetMemberRepository.save(budgetMember);

          BudgetAssistant budgetAssistant =new BudgetAssistant();
          budgetAssistant.setEmail("vbjkl");
          budgetAssistant.setFirstName("knjml");
          budgetAssistant.setLastName("sdf");
          budgetAssistant.setPassword("1234");
          Role role2=new Role();
          role2.setName("BUDGET_ASSISTANT");
          roleRepository.save(role2);
          budgetAssistant.setRole(role2);
          budgetAssistant.setAreaOfExpertise("asdfg");
          budgetAssistant.setUsername("wedfgb");
          budgetAssistant.setPostalCode("dfg");
          budgetAssistant.setYearsOfExperience(5);
          budgetAssistantRepository.save(budgetAssistant);
      }
    }
}
