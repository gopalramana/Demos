package com.brain.software.atm;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ATM {

	static Map<String, Integer> denomsAvail = new LinkedHashMap<String, Integer>();
	static int availbal = 0;
	int withdraw, deposit;

	public static void main(String args[]) {

		ATM atmObj = new ATM();
		Scanner scannerObj = new Scanner(System.in);
		while (true) {
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Balance");
			System.out.println("Choose 4 for EXIT");
			System.out.print("Choose the operation you want to perform:");

			int n = scannerObj.nextInt();
			switch (n) {
			case 1:
				System.out.print("Enter money to be withdrawn:");
				atmObj.withdraw = scannerObj.nextInt();
				if (atmObj.availbal >= atmObj.withdraw) {
					Set<String> keys = denomsAvail.keySet();
					TreeSet<Integer> temp = new TreeSet<Integer>();
					for (String str : keys) {
						if(denomsAvail.get(str) > 0) {
							temp.add(DenominationsEnum.getDenomValue(str));
						}
					}
					int min = 0;
					if(null != temp && !temp.isEmpty()) {
						min = temp.first();
					}
					if (atmObj.withdraw % min != 0) {
						System.out.println("Denominations for Entered amount is not availabale");
						break;
					}
					atmObj.withdraw(atmObj.withdraw);
					System.out.println("Please collect your money");
				} else {
					System.out.println("Incorrect or insufficient funds");
				}
				break;

			case 2:
				System.out.println("Enter money to be deposite in denominations");
				Integer depositbalance = 0;
				for (DenominationsEnum denominations : DenominationsEnum.values()) {
					System.out.print("Enter Number of " + denominations.getSelectedCurrency() + " notes :: ");
					int numberOfnotes = scannerObj.nextInt();
					if (numberOfnotes < 0) {
						System.out.println("Incorrect deposit amount");
						depositbalance=0;
						denomsAvail.clear();
						break;
					}
					depositbalance = depositbalance + denominations.getSelectedDenomaination() * numberOfnotes;
					if (denomsAvail.containsKey(denominations.getSelectedCurrency())) {
						int availdenominationsCount = (int) denomsAvail.get(denominations.getSelectedCurrency());
						denomsAvail.put(denominations.getSelectedCurrency(), numberOfnotes + availdenominationsCount);
					} else {
						denomsAvail.put(denominations.getSelectedCurrency(), numberOfnotes);
					}
				}
				System.out.println(depositbalance);
				if (depositbalance > 0)
					atmObj.deposit(depositbalance);
				else
					System.out.println("Deposit amount cannot be zero");
				break;

			case 3:
				System.out.println("Balance : " + availbal);
				System.out.println("");
				break;

			case 4:
				System.exit(0);

			default:
				System.exit(0);
			}
		}
	}

	public void withdraw(int amount) {

		StringBuffer dispenseBuffer = new StringBuffer();
		int legderbalance = availbal - amount;
		int existingDenominationsCount = 0;
		for (DenominationsEnum denomEnum : DenominationsEnum.values()) {
			if (amount >= denomEnum.getSelectedDenomaination()) {
				if (denomsAvail.containsKey(denomEnum.getSelectedCurrency())) {
					existingDenominationsCount = (int) denomsAvail.get(denomEnum.getSelectedCurrency());
					int existingAvailableAmount = existingDenominationsCount * denomEnum.getSelectedDenomaination();
					if (existingAvailableAmount >= amount) {
						int noCanbeServed = (int) Math.floor(amount/denomEnum.getSelectedDenomaination());
						amount = amount - (noCanbeServed * denomEnum.getSelectedDenomaination());
					   dispenseBuffer.append(denomEnum.getSelectedCurrency()).append("=").append(noCanbeServed).append("::");
						denomsAvail.put(denomEnum.getSelectedCurrency(),(int) denomsAvail.get(denomEnum.getSelectedCurrency()) - noCanbeServed);
					} else {
						amount = amount - existingDenominationsCount * denomEnum.getSelectedDenomaination();
						dispenseBuffer.append(denomEnum.getSelectedCurrency()).append("=").append(existingDenominationsCount).append("::");
						denomsAvail.put(denomEnum.getSelectedCurrency(),(int) denomsAvail.get(denomEnum.getSelectedCurrency()) - existingDenominationsCount);
					}

				}
			}
		}
		System.out.println("Dispensed ->" + dispenseBuffer.toString());
		System.out.println("Balance" + denomsAvail + ",Total ::" + legderbalance);
		availbal = legderbalance;
	}

	public void deposit(int depositbalance) {
		availbal = availbal + depositbalance;
		System.out.println("Balance" + denomsAvail + ",Total ::" + availbal);
	}

}