/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classchallenge;
import java.lang.*;
/**
 *
 * @author Marlex
 */

public class Account {
    private int account_number;
    private float account_balance;
    private String customer_name;
    private String email;
    private long phone_number;
    public Account(){
        
    }
    public int getAccountNumber(){
        return account_number;
    }
    public void setAccountNumber(int account_number){
        this.account_number = account_number;
    }
    public float getAccountBalance(){
        return account_balance;
    }
    public void setAccountBalance(float account_balance){
        this.account_balance = account_balance;
    }
    public String getCustomer(){
        return customer_name;
    }
    public void setCustomer(String customer_name){
        this.customer_name = customer_name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public long getPhoneNumber(){
        return phone_number;
    }
    public void setPhoneNumber(long phone_number){
        this.phone_number = phone_number;
    }
    public boolean deposit(Account acc, float balance, float amount){
        if(amount >= 0){
            balance += amount;
            acc.setAccountBalance(balance);
            return true;
        }
        else{
            return false;
        }
        
    }
    public boolean withdraw(Account acc, float balance, float amount){
        if(acc.getAccountBalance() >= amount && amount >= 0){
            balance -= amount;
            acc.setAccountBalance(balance);
            return true;
        }
        else{
            return false;
        }
    }
}

