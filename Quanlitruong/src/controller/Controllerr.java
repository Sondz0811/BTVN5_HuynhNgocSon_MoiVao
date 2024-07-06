/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Doituong;
import model.Student;
import model.Teacher;
import thuvien.Book;
import thuvien.Paper;
import thuvien.Thuvien;

/**
 *
 * @author sonhuynh081104
 */
public class Controllerr {
   private static ArrayList<Doituong> Dt = new ArrayList();
   public static Scanner sc = new Scanner(System.in);
   
   
   public static void addStudent(){
       System.out.println("madoituong:");
       String mdt = sc.nextLine();
       System.out.println("tendoituong:");
       String tdt = sc.nextLine();
       System.out.println("gioitinh:");
       Boolean gt = Boolean.parseBoolean(sc.nextLine());
       System.out.println("yob:");
       String yob = sc.nextLine();
       System.out.println("lop:");
       String lop = sc.nextLine();
       System.out.println("ban:");
       String ban = sc.nextLine();
       Student st = new Student(lop,ban,mdt,tdt,yob,gt);
       Dt.add(st);
   }
   
   
   
   public static void addTeacher(){
       System.out.println("madoituong:");
       String mdt1 = sc.nextLine();
       System.out.println("tendoituong:");
       String tdt1 = sc.nextLine();
       System.out.println("gioitinh:");
       Boolean gt1 = Boolean.parseBoolean(sc.nextLine());
       System.out.println("yob:");
       String yob1 = sc.nextLine();
       System.out.println("MonDay:");
       String md = sc.nextLine();
       System.out.println("TrinhDo:");
       String td = sc.nextLine();
       Teacher gv = new Teacher(md,td,mdt1,tdt1,yob1,gt1);
       Dt.add(gv);
   }
   public static void inra(){
       for (Doituong doituong : Dt) {
           System.out.println(doituong);
       }
       
   }
   private static ArrayList<Thuvien> Tv = new ArrayList();
   public static void addBook(){
       System.out.println("sotrang:");
       int st = Integer.parseInt(sc.nextLine());
       System.out.println("matailieu:");
       String mtl = sc.nextLine();
       System.out.println("tentailieu:");
       String ttl = sc.nextLine();
       System.out.println("ngayxuatban:");
       String nxb = sc.nextLine();
       Book b1 = new Book(st,mtl,ttl,nxb);
       Tv.add(b1);
   }
   public static void addPaper(){
       System.out.println("taiban:");
       int tb = Integer.parseInt(sc.nextLine());
       System.out.println("matailieu:");
       String mtl = sc.nextLine();
       System.out.println("tentailieu:");
       String ttl = sc.nextLine();
       System.out.println("ngayxuatban:");
       String nxb = sc.nextLine();
       Paper p1 = new Paper(tb,mtl,ttl,nxb);
       Tv.add(p1);
   }
   public static void inSachVaThuVien(){
       for (Thuvien thuvien : Tv) {
           System.out.println(thuvien);
       }
   }
   
}
