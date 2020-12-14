import java.util.Random;

public class BankAccount {
    private String acctNum;
    private double checkBal;
    private double saveBal;
    public static int numOfAccounts;
    public static int accountBalance;

    public void BankAccount(String acctNum, Double checkBal, Double saveBal) {
        this.acctNum = genAcctNum();
        this.checkBal = checkBal;
        this.saveBal = saveBal;
        BankAccount.numOfAccounts += 1;
    }
    
    public void depositMoney(String acctType, Double depositAmount) {
        if (acctType.equals("Checking")) {
            this.checkBal += depositAmount;
        } else if (acctType.equals("Savings")) {
            this.saveBal += depositAmount;
        }
    }

    public double totalBalance() {
        return(checkBal + saveBal);
    }


    private String genAcctNum() {
        Random r = new Random();
        return(String.valueOf(r.nextInt(999999999)));
    }

    public String getAcctNum() {
        return(this.acctNum);
    }

    public Double getCheckBal() {
        return(this.checkBal);
    }

    public Double getSaveBal() {
        return(this.saveBal);
    }

    public void setAcctNum() {
        this.acctNum = genAcctNum();
    }

    public void setCheckBal(Double checkBal) {
        this.checkBal = checkBal;
    }

    public void setSaveBal(Double saveBal) {
        this.saveBal = saveBal;
    }

}