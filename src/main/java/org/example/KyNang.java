package org.example;

public class KyNang {
    private String tenKyNang;
    private int trinhDo;

    public KyNang(String tenKyNang, int trinhDo) {
        this.tenKyNang = tenKyNang;
        this.trinhDo = trinhDo;
    }

    public String getTenKyNang() {
        return tenKyNang;
    }

    public int getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(int trinhDo) {
        this.trinhDo = trinhDo;
    }
}
