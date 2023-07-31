
package com.mycompany.labquestion1;

abstract public class BankAccount
{
    private int accNo;
    private float balance;
    
    public void setAccNo(int accNo)
    {
        this.accNo=accNo;
    }
    public int getAccNo()
    {
        return accNo;
    }
    
    public void setBalance(float balance)
    {
        this.balance=balance;
    }
    public float getBalance()
    {
        return balance;
    }
    
    public abstract void calculateInterest();
    
}
