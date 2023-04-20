package com.example.registrationform;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="userregister")
public class User {
    
    private String name;
    @Id
    private String username;
    private String email;
    private String phone;
    private String password;
    private String cpassword;
    private String gender;


}
