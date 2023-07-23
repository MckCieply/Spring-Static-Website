package com.mckcieply;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class NumberForm {
    @NotNull
    @Size(min=9, max=12)
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "NumberForm{" +
                "number=" + number +
                '}';
    }
}
