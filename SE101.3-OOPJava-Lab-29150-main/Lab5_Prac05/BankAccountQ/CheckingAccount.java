
package com.mycompany.labquestion1;

public class CheckingAccount extends BankAccount
{
    private static final double Checking_Interest_Rate=0.02;
    
    @Override
     public void calculateInterest()
    {
        double interest = getBalance() * Checking_Interest_Rate;
        System.out.println("The Interest of the Checking Account is "+interest);
    }
}
