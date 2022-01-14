import java.util.ArrayList;
import java.util.Scanner;

public class CashierAutomatic {
    private bankAccount bankAccount;
    private String userName;
    private String password;

    public CashierAutomatic( String userName, String password){
        this.bankAccount=new SavingAccount(userName, 5000);
        this.userName=userName;
        this.password=password;
    }

    public void showBalance(){
        System.out.println(bankAccount.getBalance()+" $");
    }

    public void depositMoney(){
        Scanner sc= new Scanner(System.in);
        boolean var1=true;
        double money;
        do{
            try{
                System.out.println("How much would you like to deposit?");
                money=sc.nextDouble();
                bankAccount.depositMoney(money);
                var1=false;
            }
            catch(Exception e){
                sc.next();
                System.out.println(e);
            }
        }
        while(var1);
    }

    public void getMoney(){
        Scanner sc= new Scanner(System.in);
        boolean var1=true;
        double money;
        do{
            try{
                System.out.println("How much would you like to withdraw?");
                money=sc.nextDouble();
                bankAccount.getMoney(money);
                var1=false;
            }
            catch(Exception e){
                sc.next();
                System.out.println(e);
            }
        }
        while(var1);
    }
    public void lastMovements(){
        RandomMovementGenerator randomMovementGenerator = new RandomMovementGenerator();
        System.out.println("How many elements do you want to consult?");
        Scanner sc = new Scanner(System.in);
        int movementsNumber=sc.nextInt();
        ArrayList<String> movements = randomMovementGenerator.getMovement(movementsNumber, "Dollar");
        showMovements(movements);
    }

    public void showMovements(ArrayList<String>movements){
        for(String movement: movements){
            System.out.println(movement);
        }
    }

    public void exit(){
        System.out.println("Thanks for use");
    }
    public void getLegalsConditions(){
        bankAccount.legalsConditions();
    }
}
