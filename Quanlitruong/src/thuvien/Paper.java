/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvien;

/**
 *
 * @author sonhuynh081104
 */
public class Paper extends Thuvien {
    private int taiban;

    public Paper(int taiban, String matailieu, String tentailieu, String ngayxuatban) {
        super(matailieu, tentailieu, ngayxuatban);
        this.taiban = taiban;
    }

    public int getTaiban() {
        return taiban;
    }

    public void setTaiban(int taiban) {
        this.taiban = taiban;
    }

    @Override
    public String toString() {
        return "Paper, " + super.toString() + "taiban=" + taiban + '}';
    }
}
