/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap4.Bai1;
 
import java.util.ArrayList;
//import java.util.Scanner;
/**
 *
 * @author 113
 */
public class TestSinhvien {
    ArrayList<Sinhvien>  sinhviens = new ArrayList<Sinhvien>();
public static void main(String[] args) {
    DanhSachSinhvien qlsv=new DanhSachSinhvien();
    Sinhvien teo=new Sinhvien();
    teo.setMasv("113");
    teo.setTensv("Nguyễn Văn Tèo");
    qlsv.addSinhvien(teo);
    Sinhvien ty=new Sinhvien();
    ty.setMasv("114");
    ty.setTensv("Nguyễn Thị tý");
    qlsv.addSinhvien(ty);
        System.out.println(qlsv);
//       Nhap();
//       Xuat();
    
    }

//    public static void Nhap() {
//        Scanner scanner = new Scanner(System.in);
//        DanhSachSinhvien qlsv=new DanhSachSinhvien();
//        ArrayList<Sinhvien> sinhviens = new ArrayList<Sinhvien>();
//        
//        System.out.print("Nhập số Sinh viên: ");
//        int n;
//        n = scanner.nextInt();
//        for ( int i=0;i<n;i++) {
//            Sinhvien sv=new Sinhvien();
//            System.out.println("Nhập mã sinh viên:");
//            scanner.nextLine();
//            sv.setMasv( scanner.nextLine());
//            System.out.println("Nhập tên sinh viên:");
//            sv.setTensv(scanner.nextLine());
//            sinhviens.add(sv);
//        }
//        
//    }
//    public static void Xuat() {
//        DanhSachSinhvien qlsv=new DanhSachSinhvien();
//        System.out.println(qlsv);
//        
//    }
}
