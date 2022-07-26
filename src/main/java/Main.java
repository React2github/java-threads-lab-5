public class Main {
    public static void main(String[] args) throws InterruptedException {

        SavingsAccount savingsAccount = new SavingsAccount();

        Thread t1 = new Thread(() -> savingsAccount.deposit(100));
        Thread t2 = new Thread(() -> savingsAccount.withdraw(20));
        Thread t3 = new Thread(() -> savingsAccount.deposit(30));

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

        System.out.println(savingsAccount.getTotal());

    }
}