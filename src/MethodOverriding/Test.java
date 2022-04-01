package MethodOverriding;

public class Test {

    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.getInterest();//1.2
        CitiBank citiBank=new CitiBank();
        citiBank.getInterest();//1.5
        HdfcBank hdfcBank=new HdfcBank();
        hdfcBank.getInterest();//1.6
        Bank bankCitiRef =new CitiBank();
        Bank bankHdfcRef =new HdfcBank();
        bankCitiRef.getInterest();//1.5
        bankHdfcRef.getInterest();//1.6
    }
}
