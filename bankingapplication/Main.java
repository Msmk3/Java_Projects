package bankingapplication;

public class Main {


    public static void main(String[] args) {

        Account madhavAccount = new Account("12345678",0,"MADHAV","madhav@xyz.com","1212121");

        madhavAccount.DepositMoney(250);
        madhavAccount.DepositMoney(100);

        madhavAccount.WithDrawMoney(100);
    
    }
}