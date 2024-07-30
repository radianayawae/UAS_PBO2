package com.mycompany.uas_sistem_bank_pbo2;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null; // Mengembalikan null jika akun tidak ditemukan
    }

    public void depositToAccount(String accountNumber, double amount) {
        Account acc = findAccount(accountNumber);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdrawFromAccount(String accountNumber, double amount) {
        Account acc = findAccount(accountNumber);
        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void printAccountDetails(String accountNumber) {
        Account acc = findAccount(accountNumber);
        if (acc != null) {
            System.out.println(acc.toString());
        } else {
            System.out.println("Account not found!");
        }
    }
}