package chapter07;

public class VariousReturnType {
    public boolean isAdult() {
        return true;
    }
    public int plus() {
        return 1 + 1;
    }
    public User getUser() {
        return new User();
    }
    public void printHello() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        VariousReturnType vrt = new VariousReturnType();
        // isAdult() 메서드 리턴값을 isAdult 변수에 저장
        boolean isAdult = vrt.isAdult();
        // .plus() 메서드 리턴값을 plusResult 변수에 저장
        int plusResult = vrt.plus();
        // getUser() 메서드 리턴값을 user 변수에 저장
        User user = vrt.getUser();
        System.out.println(isAdult);
        System.out.println(plusResult);
        System.out.println(user);
        vrt.printHello();
    }
}