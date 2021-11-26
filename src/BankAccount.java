public class BankAccount {

    int id;
    String name;
    double balance;
    

    public static void main (String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Roma";
        MyAccount.balance = 12.33;

        YourAccount.id = 2;
        YourAccount.name = "Yuara";
        YourAccount.balance = 15.55;

        HisAccount.id = 3;
        HisAccount.name = "Tolya";
        HisAccount.balance = 20.05;

        System.out.println(HisAccount.balance);


    }
}
