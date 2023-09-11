/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classchallenge;
import java.lang.*;
/**
 *
 * @author Marlex
 */
public class Main {
    
    public static void printBalance(Account acc, boolean success){
        if(success){
            System.out.printf("Balance: %.2f\n",acc.getAccountBalance());
        }
    }
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account();
        boolean successful;
        acc1.setAccountNumber(20103264);
        acc1.setAccountBalance(5000.00f);
        acc1.setCustomer("Marlex Lance A. Manalili");
        acc1.setEmail("20103264@usc.edu.ph");
        acc1.setPhoneNumber(639999999999L);
        acc2.setAccountNumber(10000000);
        acc2.setAccountBalance(7500.00f);
        acc2.setCustomer("The Keeper");
        acc2.setEmail("thekeeper@usc.edu.ph");
        acc2.setPhoneNumber(639999999999L);
        successful = acc1.deposit(3000.32f);
        printBalance(acc1, successful);
        successful = acc1.withdraw(7000.00f);
        printBalance(acc1, successful);
        successful = acc1.withdraw(1000.0f);
        printBalance(acc1, successful);
        successful = acc2.transfer(acc1, 7500.0f);
        printBalance(acc1, successful);
        printBalance(acc2, successful);
    }
}
