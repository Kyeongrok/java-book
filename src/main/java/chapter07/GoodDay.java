package chapter07;

public class GoodDay {
    public void printMessage(String message) {
        System.out.println(message);
    }
    public void printMessageWithName(String name, String message) {
        System.out.printf("%s 님 %s\n", name, message);
    }
    public static void main(String[] args) {
        GoodDay goodDay = new GoodDay();
        goodDay.printMessage("안녕하세요.");
        goodDay.printMessageWithName("김경록", "좋은 하루 보내세요.");
    }
}