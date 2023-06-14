package org.book.etc.bbs;

public class Criteria {
    private int page;
    private int perPageNum;

    public Criteria() {
        this.page = 1;
        this.perPageNum = 10;
    }

    public int getPageStart() {
        return (page - 1) * perPageNum;
    }

    // select * from board limit 0, 10
}
