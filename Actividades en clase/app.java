package notas;
public class app {

    public static class BankAccount {
String accountNumber;
String owner;
double balance ;

void deposit(double amount ){
    balance += amount;
    System.out.println("deposito "+ amount + "nuevo balance "+ balance  ); 
}

void withdraw(double amount ){
    if (balance >= amount ){
        balance-=amount ;
        System.out.println("retiro "+ amount + "ahora el balance es " + balance);
    } else{
        System.out.println("trabaja porque estas limpio ");
    }

}

    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
    account1.accountNumber= "777-777-777";
    account1.balance= 5000000;
    account1.owner= "alejandro";
    System.out.println(account1.owner);
    account1.deposit( 5000000);
    System.out.println(account1.balance);

    System.out.println("bienvenido "+ account1.owner );
    System.out.println("su saldo es de "+ account1.balance );
    System.out.println("su numero de cuenta es "+account1.accountNumber);

    }
}