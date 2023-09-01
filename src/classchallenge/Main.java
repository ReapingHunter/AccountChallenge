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
        Account acc = new Account();
        boolean successful = false;
        acc.setAccountNumber(20103264);
        acc.setAccountBalance(5000.00f);
        acc.setCustomer("Marlex Lance A. Manalili");
        acc.setEmail("20103264@usc.edu.ph");
        acc.setPhoneNumber(639999999999L);
        successful = acc.deposit(acc, acc.getAccountBalance(), 3000.32f);
        printBalance(acc, successful);
        successful = acc.withdraw(acc, acc.getAccountBalance(), 7000.00f);
        printBalance(acc, successful);
        successful = acc.withdraw(acc, acc.getAccountBalance(), -1000.00f);
        printBalance(acc, successful);
    }
}
