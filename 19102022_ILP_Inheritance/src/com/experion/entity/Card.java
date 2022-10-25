package com.experion.entity;

public class Card extends Product {
	private String cardType;
	private BankServices bankServices;
	public Card(String productCode, String productName, String productType, String cardType) {
		super(productCode, productName, productType);
		this.cardType = cardType;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public BankServices getBankServices() {
		return bankServices;
	}
	public void setBankServices(BankServices bankServices) {
		this.bankServices = bankServices;
	}

	
}
