package com.training.boot.example.crm;

import com.training.boot.example.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer extends User {
}
