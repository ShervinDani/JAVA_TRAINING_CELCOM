package com.celcom.atm;

public class Atm {
    private static double total_amount = 5000; // Shared resource

    // Withdraw method
    public synchronized void withdraw(int amount) {
        if (amount > total_amount) {
            System.out.println("Insufficient Balance for: " + Thread.currentThread().getName());
            return;
        }

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        total_amount -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew: ₹" + amount);
        System.out.println("Remaining Balance: ₹" + total_amount);
    }
}
