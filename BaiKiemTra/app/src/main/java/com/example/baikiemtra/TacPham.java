package com.example.baikiemtra;

public class TacPham {
    private int hinhanh;
        private String ten, namPhatHanh;

    public TacPham(int hinhanh, String ten, String namPhatHanh) {
        this.hinhanh = hinhanh;
        this.ten = ten;
        this.namPhatHanh = namPhatHanh;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamPhatHanh() {
        return namPhatHanh;
    }

    public void setNamPhatHanh(String namPhatHanh) {
        this.namPhatHanh = namPhatHanh;
    }
}
