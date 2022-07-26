public class SavingsAccount {

  private long total = 0;

  public synchronized boolean withdraw(long amount) {
    if(total < amount) {
      System.out.println("Can't withdraw. Insufficient funds");
      System.out.println(total + " if total less than amount");
      return false;
    } else {
      System.out.println("Please wait. Dispensing cash");
      total -= amount;
      System.out.println(total + " if total is greater than amount");
      return true;
    }
  }

  public synchronized void deposit(long amount) {
    total += amount;
    System.out.println(total + "  deposit amount");
  }

  public synchronized long getTotal() {
    return total;
  }
}