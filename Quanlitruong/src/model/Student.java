/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sonhuynh081104
 */
public class Student extends Doituong {
    private String lop,ban;

    public Student(String lop, String ban, String madoituong, String tendoituong, String yob, Boolean gioitinh) {
        super(madoituong, tendoituong, yob, gioitinh);
        this.lop = lop;
        this.ban = ban;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    @Override
    public String toString() {
        return "Student, " + super.toString() + "lop=" + lop + ", ban=" + ban + '}';
    }
    
}
