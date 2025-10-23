
public class App {

public static class BankAccount {
    // Atributos
    String accountNumber;
    String owner;
    double balance;
    //metodos
    void deposit (double amount)  {
        balance += amount;
        System.out.println("deposito:" + amount +  "    nuevo balance  " +      balance    );
    }
    void whitdraw (double amount){
        if (balance>= amount) {
            balance -= amount;
        System.out.println("Retiro:" + amount+ " Ahora el balance es:  "+ balance );
        }else{
            System.out.println( "NO tiene fondos suficientes " );
          }
          }
          void showBalance(){
            System.out.println(owner+"tu balance de cuenta es:" +balance);
    }
    }    public static void main(String[] args) throws Exception {
    BankAccount account1= new BankAccount();
    account1.owner="Frank";
    account1.balance=2000000;
    account1.accountNumber="5555-555-555";

    account1.showBalance();
    }
    
}
