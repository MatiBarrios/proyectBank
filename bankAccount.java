public abstract class bankAccount {
    private String name;
    private AccountType typeAccount;
    protected double balance;

    public bankAccount(String name, AccountType typeAccount, double balance){
        this.name=name;
        this.typeAccount=typeAccount;
        this.balance=balance;
    }

    public bankAccount(String name, double balance){
        this.name=name;
        this.typeAccount=AccountType.SAVING;
        this.balance=balance;
    }

    public bankAccount(){
        this.typeAccount=AccountType.SAVING;
    }
    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    public void getMoney(double val){
        if (val>this.balance){
            System.out.println("Sorry you don't have enough money");
            return;
        }else if(val<0){
            System.out.println("Sorry you can't put negative values");
            return;
        }else{
            this.balance-=val;
        }
    }
    public void depositMoney(double val){
        if (val<0){
            return;
        }else{
            this.balance+=val;
        }
    }
    protected void changeAccountTipe(AccountType typeAccount){
        this.typeAccount=typeAccount;
    }
    public AccountType getAccountType(){
        return this.typeAccount;
    }

    public abstract void legalsConditions();
}