/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvien;

/**
 *
 * @author sonhuynh081104
 */
public class Book extends Thuvien {
    private int Sotrang;

    public Book(int Sotrang, String matailieu, String tentailieu, String ngayxuatban) {
        super(matailieu, tentailieu, ngayxuatban);
        this.Sotrang = Sotrang;
    }

    public int getSotrang() {
        return Sotrang;
    }

    public void setSotrang(int Sotrang) {
        this.Sotrang = Sotrang;
    }

    @Override
    public String toString() {
        return "Book, " + super.toString() + "Sotrang=" + Sotrang + '}';
        
    }
}
