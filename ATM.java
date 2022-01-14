import java.util.Scanner;
/*
    This program is a practice from the curse of java essencials in linkedin
*/ 
public class ATM {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean reg=true;
        System.out.println("please choose one Username");
        String userName=sc.next();
        System.out.println("please choose one Password");
        String password=sc.next();
        CashierAutomatic cashierAutomatic=new CashierAutomatic(userName, password);
        do{
            try{
                System.out.println("please choose one of the following options");
                System.out.println("     Write 1 Consult your balance ");
                System.out.println("     Write 2 Deposit money ");
                System.out.println("     Write 3 Withdraw money ");
                System.out.println("     Write 4 Consult your last movements ");
                System.out.println("     Write 5 Consult legal's terms ");
                System.out.println("     Write other number to close ");
                int selection=sc.nextInt();
                switch (selection) {
                    case 1:
                        System.out.println("You select Consult your balance");
                        cashierAutomatic.showBalance();
                        break;
                    case 2:
                        System.out.println("You select Deposit money");
                        cashierAutomatic.depositMoney();
                        break;
                    case 3:
                        System.out.println("You select Withdraw money");
                        cashierAutomatic.getMoney();
                        break;
                    case 4:
                        System.out.println("You select Consult your last movements");
                        cashierAutomatic.lastMovements();
                        break;
                    case 5:
                        System.out.println("You select Consult legal's terms");
                        cashierAutomatic.getLegalsConditions();
                        break;
                    default:
                        cashierAutomatic.exit();
                        reg=false;
                        break;
                }
                System.out.println("");
            }
            catch(Exception e){
                sc.next();
                System.out.println(e);
                System.out.println("");
            }
        }while(reg);
        sc.close();
    }
}
