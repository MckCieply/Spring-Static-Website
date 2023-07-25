package com.mckcieply;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ContactForm {
    @NotNull
    @Size(min=9, max=12)
    private int number;

    @NotNull
    private String email;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactForm{" +
                "number=" + number +
                ", email='" + email + '\'' +
                '}';
    }
}
