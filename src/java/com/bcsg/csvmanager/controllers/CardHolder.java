package java.com.bcsg.csvmanager.controllers;

import java.com.bcsg.csvmanager.models.CreditCard;
import java.util.List;

public class CardHolder {

	private List<CreditCard> creditCards;
	
	public int size() {
		return creditCards.size();
	}
	
	public CreditCard get(int index) {
		return creditCards.get(index);
	}
	
	public void setCreditCards(List<CreditCard> creditsCards) {
		
	}
	
	public void maskCardsNumber() {
		
	}
	
	public void sortCards() {
		
	}
	
	private void maskCardNumber(CreditCard creditCard) {
		
	}
	
	public void displayCreditCard() {
		
	}
}
