/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sonhuynh081104
 */
public class Doituong {
    protected String madoituong,tendoituong,yob;
    protected Boolean gioitinh;

    public Doituong(String madoituong, String tendoituong, String yob, Boolean gioitinh) {
        this.madoituong = madoituong;
        this.tendoituong = tendoituong;
        this.yob = yob;
        this.gioitinh = gioitinh;
    }

    public String getMadoituong() {
        return madoituong;
    }

    public void setMadoituong(String madoituong) {
        this.madoituong = madoituong;
    }

    public String getTendoituong() {
        return tendoituong;
    }

    public void setTendoituong(String tendoituong) {
        this.tendoituong = tendoituong;
    }

    public String getYob() {
        return yob;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    public Boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "Doituong{" + "madoituong=" + madoituong + ", tendoituong=" + tendoituong + ", yob=" + yob + ", gioitinh=" + gioitinh + ',';
    }
}
