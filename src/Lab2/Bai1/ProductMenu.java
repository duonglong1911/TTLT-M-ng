/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.Bai1;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class ProductMenu {
    public static void main(String[] args) {
        int n = 0;
        Product a = new Product();
        Product[] product = null;
        do {
            menu();
            System.out.println("Nhập vào lựa chọn của bạn :");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    int m;
                    System.out.println("Nhập số hàng hóa muốn thêm :");
                    m = Integer.parseInt(sc.nextLine());
                    product = new Product[m];
                    for (int i = 0; i < m; i++) {
                        System.out.println("Nhập thông tin hàng hóa thứ: "+i);
                        product[i] = new Product();
                        product[i].input();
                    }
                break;
                }
                case 2: {
                    if (product == null) {
                        System.out.println("Bạn chưa nhập dữ liệu");
                    } else {
                        System.out.println("Dữ liệu bạn vừa nhập là :");
                        for (int i = 0; i < product.length; i++) {
                            System.out.println("Thông tin hàng hóa thứ: " + (i + 1));
                            product[i].output();
                        }
                    }
                break;
            }
            case 3: {
                if (product == null) {
                    System.out.println("Bạn chưa nhập dữ liệu");
                } else {
                    a.sort(product);
                    System.out.println("Dữ liệu sau khi sắp xếp là :");
                    for (int i = 0; i < product.length; i++) {
                        System.out.println("Thông tin hàng hóa thứ: " + (i + 1));
                        product[i].output();
                    }
                }
                break;
            }
            case 4:
                break;
            default: {
                System.out.println("Không có lựa chọn của bạn ");
                break;
                }
            }
        } while (n != 4);
    }
    
    public static void menu(){
        System.out.println("1: Nhập sản phẩm");
        System.out.println("2: Xuất sản phẩm");
        System.out.println("3: Sắp xếp sản phẩm");
        System.out.println("4: Thoát");
    }
}
