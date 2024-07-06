/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvien;

/**
 *
 * @author sonhuynh081104
 */
public class Thuvien {
    protected String matailieu,tentailieu,ngayxuatban;

    public Thuvien(String matailieu, String tentailieu, String ngayxuatban) {
        this.matailieu = matailieu;
        this.tentailieu = tentailieu;
        this.ngayxuatban = ngayxuatban;
    }

    public String getMatailieu() {
        return matailieu;
    }

    public void setMatailieu(String matailieu) {
        this.matailieu = matailieu;
    }

    public String getTentailieu() {
        return tentailieu;
    }

    public void setTentailieu(String tentailieu) {
        this.tentailieu = tentailieu;
    }

    public String getNgayxuatban() {
        return ngayxuatban;
    }

    public void setNgayxuatban(String ngayxuatban) {
        this.ngayxuatban = ngayxuatban;
    }

    @Override
    public String toString() {
        return "Thuvien{" + "matailieu=" + matailieu + ", tentailieu=" + tentailieu + ", ngayxuatban=" + ngayxuatban + ',';
    }
}
