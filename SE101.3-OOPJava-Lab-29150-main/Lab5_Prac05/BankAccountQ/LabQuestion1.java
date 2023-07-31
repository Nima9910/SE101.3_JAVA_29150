
package com.mycompany.labquestion1;

public class LabQuestion1 
{

    public static void main(String[] args)
    {
       SavingAccount savingAcc=new SavingAccount();
       savingAcc.setAccNo(20);
       savingAcc.setBalance(20000000);
       System.out.println("Account No: "+savingAcc.getAccNo());
       savingAcc.calculateInterest();
       
       CheckingAccount checkingAcc=new CheckingAccount();
       checkingAcc.setBalance(1000000);
       checkingAcc.calculateInterest();
    }
}
