public class Main {
    public static void main(String[] args) {
       Person bill= new Person().constructPerson("bill",76);
       Person sam = new Person().constructPerson("sam",43,456783,5678.34,"Vells Vargo Brazil");
       Person sue = new Person().constructPerson("sue",12);
       Person ana = new Person().constructPerson("ana",26);
       Account newAccount = new Account().setUpp("Banko del narko",999776.32,666060606);

       bill.setBankAccount(newAccount);
       ana.setBankAccount( new Account().setUpp("Willemett Savings and stuff",26789.45,68950234));

       Double why = bill.deposit(400000);






        bill.printInfo();
        sam.printInfo();
        sue.printInfo();
        ana.printInfo();

    }
}
class Person{
   private String name = "anon";
   private int age =0;
   private Account bankAccount;
   public Person constructPerson( String s, int i){
        new Person();
        this.age=i;
        this.name=s;
        this.bankAccount=new Account();
        bankAccount.setUp("",0,0);
       //this.makePerson(s,i);
       return this;
   }

    public Person constructPerson( String s, int i,int act,double ball,String bname){
        new Person();
        this.makePerson(s,i,act,ball,bname);
        return this;
    }
    private Person makePerson(String nm,int ag,int actnm,double actbal,String bankNam){
        name=nm;
        age=ag;
        bankAccount = new Account().setUpp(bankNam,actbal,actnm);
       // bankAccount.setUp(bankNam,actbal,actnm);
        return this;
    }

    private void makePerson(String nm,int ag,Account ac){
        name=nm;
        age=ag;
        bankAccount=ac;
    }
    private void makePerson(String nm,int ag){
        name=nm;
        age=ag;
        bankAccount=new Account().setUpp("",0,0);
       // bankAccount.setUp("",0,0);

    }
 public String getName(){
        return name;
 }
public void setName(String nam){
        name=nam;
}

public int getAge() {
    return age;
}
private void setAge(int ag){
        age=ag;
}

public Account getBankAccount(){
       return bankAccount;
}
public void setBankAccount(Account ba){
       bankAccount=ba;
}

void printInfo(){
        System.out.println();
        System.out.println("Name "+name);
        System.out.println("Age "+age);
        System.out.println("Bank Name "+bankAccount.getName());
        System.out.println("Account number "+bankAccount.getAccountNum());
        System.out.println("Account Balance "+bankAccount.getBalance());
}

public double deposit(double amount){
       bankAccount.credit(amount);
       return bankAccount.getBalance();
}

public double withdraw(double amount){
        bankAccount.debit(amount);
        return bankAccount.getBalance();
    }


}// end of the person class



class Account{
    private int accountNum;
   private double balance=0;
   private String bankName="unknown";


    // constructor factory method
    public void setUp(String bankNameIn,double balanceIn,int accountNumIn){
        bankName=bankNameIn;
        balance=balanceIn;
        accountNum=accountNumIn;
    }

    public Account setUpp(String bankNameIn,double balanceIn,int accountNumIn){
        bankName=bankNameIn;
        balance=balanceIn;
        accountNum=accountNumIn;
        return this;
    }

    private void setName(String name){
        bankName=name;
    }
    String getName(){
        return bankName;
    }

    public void credit(double amount){
        balance=balance + amount;
    }

   public void debit(double amount){
        balance=balance-amount;
    }
   public double getBalance(){
        return balance;
    }
   private void setBalance(double bal){
        balance=bal;
    }

    private void setAccountNum(int anm){
        accountNum=anm;
    }
    public int getAccountNum(){
        return accountNum;
    }
}