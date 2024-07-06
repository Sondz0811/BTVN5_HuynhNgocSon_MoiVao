/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sonhuynh081104
 */
public class Teacher extends Doituong {
    private String MonDay,TrinhDo;

    public Teacher(String MonDay, String TrinhDo, String madoituong, String tendoituong, String yob, Boolean gioitinh) {
        super(madoituong, tendoituong, yob, gioitinh);
        this.MonDay = MonDay;
        this.TrinhDo = TrinhDo;
    }

    public String getMonDay() {
        return MonDay;
    }

    public void setMonDay(String MonDay) {
        this.MonDay = MonDay;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String TrinhDo) {
        this.TrinhDo = TrinhDo;
    }

    
    @Override
    public String toString() {
        return "Teacher, " + super.toString() + "MonDay=" + MonDay + ", TrinhDo=" + TrinhDo + '}';
    }
}
