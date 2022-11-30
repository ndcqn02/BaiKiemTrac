package com.example.baikiemtra;

import java.io.Serializable;

public class NgonNgu implements Serializable {
    private String ten, vidu;
    private int hinhAnh;

    public NgonNgu(String ten, String vidu, int hinhAnh) {
        this.ten = ten;
        this.vidu = vidu;
        this.hinhAnh = hinhAnh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getVidu() {
        return vidu;
    }

    public void setVidu(String vidu) {
        this.vidu = vidu;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
