package chapter08;

public class TwoCtorCompanyTest {
    public static void main(String[] args) {
        TwoCtorCompany company1 = new TwoCtorCompany(30_000_000);
        company1.printDebit();
        TwoCtorCompany company2 = new TwoCtorCompany();
        company2.printDebit();
    }
}