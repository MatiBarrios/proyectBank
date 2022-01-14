public class PayrollAccount extends bankAccount {
    public PayrollAccount(String name, AccountType typeAccount, double balance){
        super(name,typeAccount,balance);
    }

    public PayrollAccount(String name, double balance){
        super(name,balance);
    }

    public PayrollAccount(){
        super();
    }

    @Override
    public void legalsConditions() {
        System.out.println("* Write something of legals conditions here");
        //yes this is a joke
    }
}
