// Index : 19000413
// Name  : N.D.Dissanayake

class Account(id: String, n: Int, b: Double) {
  val nic: String = id;
  val acNumber: Int = n;
  var balance: Double = b;

  def withdraw(amount: Double) = this.balance -= amount;
  def deposit(amount: Double) = this.balance += amount;
  def transfer(account: Account, amount: Double) = {
    this.withdraw(amount);
    account.deposit(amount);
  }
  override def toString =
    "[" + nic + " : " + acNumber + " : " + balance + "]"
}

object question1 extends App {
  var acc1 = new Account("1234", 1, 4500);
  var acc2 = new Account("4321", 2, 2750);

  println("Before transfer");
  printf("  Account 1: %s\n", acc1);
  printf("  Account 2: %s\n", acc2);

  println("\nAfter transferring 565 from Account 1 to Account 2");
  acc2.transfer(acc1, 565);
  printf("  Account 1: %s\n", acc1);
  printf("  Account 2: %s\n", acc2);
}
