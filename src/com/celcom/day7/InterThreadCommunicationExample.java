package com.celcom.day7;

class SavingsAccount {
	private long balance;

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
}

class Depositor extends Thread {
	SavingsAccount account;

	public Depositor(SavingsAccount account) {
		this.account = account;
	}

	public void run() {
		synchronized (account) {
			System.out.println("Depositing Money....!");
			account.setBalance(100000000);
			account.notifyAll();
			System.out.println("Money got deposited");
		}
	}
}

class WithDrawer extends Thread {
	SavingsAccount account;

	public WithDrawer(SavingsAccount account) {
		this.account = account;
	}

	public void run() {
		synchronized (account) {
			System.out.println("Waiting for the depositor to deposit");
			try {
				account.wait();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The Maximum amount you can withdraw is : " + account.getBalance());
			account.setBalance(account.getBalance()-2000);
		}
	}
}

public class InterThreadCommunicationExample {

	public static void main(String[] args) throws InterruptedException {
		SavingsAccount account = new SavingsAccount();
		WithDrawer withdraw = new WithDrawer(account);
		withdraw.start();
		WithDrawer withdraw1 = new WithDrawer(account);
		withdraw1.start();
		
		Depositor deposit = new Depositor(account);
		deposit.sleep(3000);
		deposit.start();
	}

}
