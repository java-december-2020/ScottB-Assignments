public class BankAccountController{
  
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.BankAccount(b.getAcctNum(), 5000.00, 10000.00);


        System.out.println(b.getAcctNum());
        System.out.println(b.getCheckBal());
        System.out.println(b.getSaveBal());
        System.out.println(BankAccount.numOfAccounts);

        b.depositMoney("Checking", 500.00);


        System.out.println(b.getCheckBal());
        System.out.println(b.getSaveBal());

        System.out.println(b.totalBalance());
    }
}