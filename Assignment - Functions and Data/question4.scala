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
  def applyInterest(): Unit = {
    if (this.balance > 0) this.balance *= 1.05;
    else if (this.balance < 0) this.balance *= 1.1;
  }
  override def toString =
    "[" + nic + " : " + acNumber + " : " + balance + "]"
}

object question1 extends App {
  var bank: List[Account] = List(
    new Account("1011", 1, -25),
    new Account("2022", 2, 1000),
    new Account("3033", 3, -900),
    new Account("4044", 4, 3000)
  );

  // List of Accounts with negative balances
  var negBalanceAccounts = bank.filter((acc) => acc.balance < 0);
  println("List of accounts with negative balance: ");
  println(negBalanceAccounts);

  // Sum of all account balances
  var getBalance = (acc: Account) => acc.balance;
  var sumOfAccounts = bank.map(getBalance).reduce((b1, b2) => b1 + b2);
  println("\nSum of all account balances:");
  println(sumOfAccounts);

  // Applying interest function
  println("\nBalance of accounts after applying the interest function: ");
  for (account <- bank) {
    account.applyInterest();
    println(account);
  }
}
