package com.celcom.atm;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm(); // ✅ Single ATM instance

        // Creating multiple threads
        Thread t1 = new Thread(() -> atm.withdraw(1000), "User-1");
        Thread t2 = new Thread(() -> atm.withdraw(2000), "User-2");
        Thread t3 = new Thread(() -> atm.withdraw(3000), "User-3");
        Thread t4 = new Thread(() -> atm.withdraw(500), "User-4");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
