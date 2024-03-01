package com.training.boot.example.crm;

import com.training.boot.example.model.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "customers")
public class Customer extends User {
    @Column(name = "card_number") // note: new column added to "User"
    @NotBlank
    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
