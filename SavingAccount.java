public class SavingAccount extends bankAccount {
    private static final double COMMISSION = 1.2;

    public SavingAccount(String name, AccountType typeAccount, double balance){
        super(name,typeAccount,balance);
    }

    public SavingAccount(String name, double balance){
        super(name,balance);
    }

    public SavingAccount(){
        super();
    }

    @Override
    public void legalsConditions() {
        System.out.println("* Write something of legals conditions here");
        //yes this is a joke
    }
    @Override
    public void getMoney(double val){
        double val1=val+COMMISSION;
        if (val1>this.balance){
            System.out.println("Sorry you don't have enough money");
            return;
        }else if(val<0){
            System.out.println("Sorry you can't put negative values");
            return;
        }else{
            this.balance-=val1;
        }
    }
}
