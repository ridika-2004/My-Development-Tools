import java.util.Scanner;

public class ATM {
    float balance;
    int pin = 5674;

    public void checkPin(){
        System.out.print("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==pin){
            menu();
        } else{
            System.out.println("Invalid pin");
        }
    }

    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1.Check balance");
        System.out.println("2.Withdraw money");
        System.out.println("3.Deposit money");
        System.out.println("4.Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt==1){
            checkBalance();
        } else if(opt==2){
            withdraw();
        } else if(opt==3){
            deposit();
        } else if(opt==4){
            return;
        } else{
            System.out.println("Enter a valid choice");
        }
    }

    private void checkBalance() {
        System.out.println("Balance : "+balance);
        menu();
    }

    private void withdraw() {
        System.out.print("Enter withdraw amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>balance){
            System.out.println("Not sufficient balance.");
        }
        else{
            balance-=amount;
            System.out.println("Money withdrawal successful");
        }
        menu();
    }

    private void deposit() {
        System.out.print("Enter withdraw amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance+=amount;
        System.out.println("Money deposit successful");
        menu();
    }
}
