package com.zephyraft.dp._1creation._4prototype._help;

public class SearchWord {

    private String keyword;
    private int count;
    private long lastUpdateTime;

    public SearchWord(String keyword, int count, long lastUpdateTime) {
        this.keyword = keyword;
        this.count = count;
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getKeyword() {
        return keyword;
    }

    public int getCount() {
        return count;
    }

    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
