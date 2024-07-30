
package com.mycompany.uas_sistem_bank_pbo2;

/**
 *
 * @author ASUS
 */
public class UAS_SISTEM_BANK_PBO2 {

    public static void main(String[] args) {
        // Membuat objek bank
        Bank bank = new Bank();

        // Membuat pelanggan dan akun
        Customer customer1 = new Customer("Kuro", "123");
        Account account1 = new Account("ACC001", customer1);

        // Menambahkan akun ke bank
        bank.addAccount(account1);

        // Melakukan operasi penyetoran dan penarikan
        bank.depositToAccount("ACC001", 500.0);   // Setor 500.0
        bank.withdrawFromAccount("ACC001", 100.0); // Tarik 100.0

        // Menampilkan detail akun
        bank.printAccountDetails("ACC001");
    }
}