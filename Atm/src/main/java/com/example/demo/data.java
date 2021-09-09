package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class data {
    private  String Card;
    private  int pin;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getCard() {
        return Card;
    }

    public void setCard(String card) {
        Card = card;
    }
}
