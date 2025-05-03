import java.util.Scanner;

class BankDetails{
    long acc_no;
    String Acc_holder;
    float Balance;

    void deposit(int deposit){
        Balance = Balance+ deposit;
        System.out.println(deposit);
    }

    void withdrawl(int withdraw){
        Balance = Balance - withdraw;
        System.out.println(withdraw);
    }
    void dispaly(){
        System.out.println(acc_no);
        System.out.println(Acc_holder);
        System.out.println(Balance);
    }
}

public class bankAccount {
    public static void main(String[] args) {
        BankDetails b= new BankDetails();
        b.Acc_holder="Vanshika";
        b.acc_no=357695140;
        b.Balance=334.67F;
        b.dispaly();
        System.out.println("Enter 1 for withdrawl and 2 for deposit the money");
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){
            b.withdrawl(12345);
        }
        if(choice==2){
            b.deposit(12345);
        }
            b.dispaly();
        
    }
    
}
