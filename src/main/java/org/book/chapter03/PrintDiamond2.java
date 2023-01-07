package org.book.chapter03;

public class PrintDiamond2 {
    private boolean mode = true;

    public PrintDiamond2() {
    }

    public PrintDiamond2(boolean mode) {
        this.mode = mode;
    }

    private String getCharLine(int i, int spaceCnt, int charCnt) {
        return (mode ? i : "") + " ".repeat(spaceCnt) + "*".repeat(charCnt);
    }
    public static void main(String[] args) {
        PrintDiamond2 printDiamond = new PrintDiamond2();
        // space찍는 공식
        int n = 7;
        for (int i = 0; i < n; i++) { // 전체적으로 돌림
            if(i <= n / 2){ // 절반을 기준으로 로직이 달라짐
                // *이 1개일때 앞에 공백이 3
                System.out.println(printDiamond.getCharLine(i, n/2 - i, 2 * i + 1));
            } else {
                System.out.println(printDiamond.getCharLine(i, i - (n/2), 2 * (n - i) - 1));
            }
        }
    }
}
