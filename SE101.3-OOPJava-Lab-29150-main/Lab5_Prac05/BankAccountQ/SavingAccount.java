
package com.mycompany.labquestion1;

public class SavingAccount extends BankAccount
{
    private static final double Saving_Interest_Rate=0.12;
    
    @Override
    public void calculateInterest()
    {
        double interest = getBalance() * Saving_Interest_Rate;
        System.out.println("The Interest of the Saving Account is "+interest);
    }
}
