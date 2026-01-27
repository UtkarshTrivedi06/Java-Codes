public class Inheritance_Bank {
    public static void main(String[] args) {
        Savings s=new Savings();
        Current c=new Current();
        s.si_calc();
        c.ci_calc();
    }
}
class Account{
    int balance=1000;
}
class Savings extends Account{
    void si_calc(){
        System.out.println("Savings: "+ balance*1.16);
    }
}
class Current extends Account{
    void ci_calc(){
        System.out.println("Current: " +balance*1.10);
    }
}