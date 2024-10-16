package chapter05;

public class MoneyReceivedAndPaid {
    public static void main(String[] args) {
        int myAccount = 1_000_000;
        myAccount = myAccount - 500_000;
        System.out.println(myAccount);
        myAccount = myAccount + 4_000_000;
        System.out.println(myAccount);
    }
}