public class SavingsAccount {

  private long total = 0;

  public synchronized boolean withdraw(long amount) {
    // checks for money
    if(total - amount >= 0) {
      System.out.println("Please wait. Dispensing cash.");
      total = total - amount;
      return true;
    } else {
      System.out.println("Insufficient funds. Goodbye");
      return false;
    }
  }

  public synchronized void deposit(long amount) {
    total = total + amount;
  }

  public synchronized long getTotal() {
    return total;
  }
}