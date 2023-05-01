package org.book.etc;

public class Eee {

    public int solution(int num) {
        int answer = 0;
        if(num == 1) return 0;

        long memo = num;

        while(memo != 1){
            if(answer == 500) return -1;
            if(memo % 2 == 0){
                memo = memo / 2;
            } else{
                memo = (memo * 3) + 1;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Eee eee = new Eee();
        int r = eee.solution(626331);
        System.out.println(r);
    }
}
