package chapter08;

public class TwoCtorCompany {
    private int debit;
    public TwoCtorCompany() {
        this.debit = 50_000_000; // 매개변수가 없는 생성자
    }
    public TwoCtorCompany(int debit) {
        this.debit = debit; // 매개변수가 있는 생성자
    }
    public void printDebit() {
        System.out.println("debit = " + debit);
    }
}