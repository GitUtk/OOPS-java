class BankAccount {
    int balance = 700;

    synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited");
        System.out.println("Balance: " + balance);
        notify();
    }

    synchronized void withdraw(int amount) {
        while (amount > balance) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        balance = balance - amount;
        System.out.println(amount + " withdrawn");
        System.out.println("Balance: " + balance);
    }
}

class WithdrawThread implements Runnable {
    BankAccount ba;

    WithdrawThread(BankAccount obj) {
        this.ba = obj;
    }

    @Override
    public void run() {
        ba.withdraw(500);
    }
}

class DepositThread implements Runnable {
    BankAccount ba;

    DepositThread(BankAccount obj) {
        this.ba = obj;
    }

    @Override
    public void run() {
        ba.deposit(500);
    }
}

public class InterThread {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();

        DepositThread thread1 = new DepositThread(obj);
        Thread t1 = new Thread(thread1);

        WithdrawThread thread2 = new WithdrawThread(obj);
        Thread t2 = new Thread(thread2);

        t2.start();
        t1.start();
    }
}