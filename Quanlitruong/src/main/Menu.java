
package main;

import java.util.Scanner;
import controller.Controllerr;
public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jo;
        do {
            System.out.println("1.addStudent, 2.addTeacher, 3.addBook, 4.addPaper, 5.HienthiraCacDoituong, 6.HienthiraSachvaTV");
            
            jo = Integer.parseInt(sc.nextLine());
            
            switch (jo) {

                case 1:
                    Controllerr.addStudent();
                    break;
                case 2:
                    Controllerr.addTeacher();
                    break;
                case 3:
                    Controllerr.addBook();
                    break;
                case 4:
                    Controllerr.addPaper();
                    break;
                case 5:
                    Controllerr.inra();
                    
                    break;
                case 6:
                    Controllerr.inSachVaThuVien();
                    break;
                case 7:
                    System.out.println("thoat chuong trinh.");
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (jo != 7);
        
    }
}
