package com.example.demo.entity;

import javax.validation.constraints.NotNull;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Entity {
	public String getCard() {
		return Card;
	}
	public void setCard(String card) {
		Card = card;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
	@JsonProperty("Card")
	@NotNull(message="card Number cannot be null")
	 private String Card;
	@JsonProperty("Pin")
	private String pin;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@JsonProperty("amount")
	private int amount;
}
