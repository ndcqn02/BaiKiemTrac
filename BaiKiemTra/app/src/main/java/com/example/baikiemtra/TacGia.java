package com.example.baikiemtra;

import java.io.Serializable;

public class TacGia implements Serializable {
    private int hinhanh;
    private String ten, mota, sao;

    public TacGia(int hinhanh, String ten, String mota, String sao) {
        this.hinhanh = hinhanh;
        this.ten = ten;
        this.mota = mota;
        this.sao = sao;
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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getSao() {
        return sao;
    }

    public void setSao(String sao) {
        this.sao = sao;
    }
}
