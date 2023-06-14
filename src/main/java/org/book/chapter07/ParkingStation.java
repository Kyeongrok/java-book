package org.book.chapter07;

public class ParkingStation {
    public void pay(int amount) {
        System.out.println("결제가 완료되었습니다.");
    }

    public void pay(Ticket ticket){
        System.out.println("주차 정산이 완료되었습니다.");
    }

    public void pay(int amount, Ticket ticket) {

    }
}
