public class SavingsAccount {

  private long total = 0;

  public boolean withdraw(long amount) {
    if(total < amount) {
      System.out.println("Can't withdraw. Insufficient funds");
      return false;
    } else {
      System.out.println("Please wait. Dispensing cash");
      total -= amount;
      return true;
    }
  }

  public void deposit(long amount) {
    total += amount;
  }

  public long getTotal() {
    return total;
  }
}