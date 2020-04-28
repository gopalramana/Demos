package com.brain.software.atm;

public enum DenominationsEnum {

	Fivety("50s",50),Twenty("20s", 20), Tens("10s", 10), Five("5s", 5), One("1s", 1);// existingAvailableAmount to support 50s and 100s for future
																	
	private int selectedDenomaination;
	private String selectedCurrency;

	DenominationsEnum(String currency, int selectedDenomination) {
		this.selectedCurrency = currency;
		this.selectedDenomaination = selectedDenomination;

	}

	public String getSelectedCurrency() {
		return selectedCurrency;
	}

	public void setSelectedCurrency(String selectedCurrency) {
		this.selectedCurrency = selectedCurrency;
	}

	public int getSelectedDenomaination() {
		return selectedDenomaination;
	}

	public void setSelectedDenomaination(int selectedDenomaination) {
		this.selectedDenomaination = selectedDenomaination;
	}
	
	public static int getDenomValue(String selectedCurrency) {
		int denomValue = 0;
		
		if(DenominationsEnum.Twenty.getSelectedCurrency().equals(selectedCurrency)) {
			denomValue = DenominationsEnum.Twenty.getSelectedDenomaination();
		} else if(DenominationsEnum.Tens.getSelectedCurrency().equals(selectedCurrency)) {
			denomValue = DenominationsEnum.Tens.getSelectedDenomaination();
		} else if(DenominationsEnum.Five.getSelectedCurrency().equals(selectedCurrency)) {
			denomValue = DenominationsEnum.Five.getSelectedDenomaination();
		} else if(DenominationsEnum.One.getSelectedCurrency().equals(selectedCurrency)) {
			denomValue = DenominationsEnum.One.getSelectedDenomaination();
		}
		
		return denomValue;
	}

}
