
package Lab4_Bai2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
public class QuanLySanPham {
    public static void main(String[] args) {
        ArrayList<SanPham> dssp = new ArrayList<>();
        SanPham sp = new SanPham();
        int option;
        Scanner sc = new Scanner(System.in);
        do{
            showMenu();
            System.out.println("Nhập lựa chọn của bạn :");
            option =Integer.parseInt(sc.nextLine());
            switch(option){
                //
            case 1:
                int n;
                System.out.println("Nhập số lượng sản phẩm :");
                n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        sp =new SanPham();
                        sp.nhapthongtin();
                        dssp.add(sp);
                    }
            case 2:
                for (int i = 0; i < dssp.size(); i++) {
                    dssp.get(i).xuatthongtin();
                }
            case 3:
                    System.out.println("Danh sách ngẫu nhiên");
                    Collections.shuffle(dssp);
                    for (SanPham sanPham : dssp) {
                        sanPham.xuatthongtin();
                    }
                break;
            
            case 4:
                Collections.sort(dssp, new Comparator<SanPham>() {
                        @Override
                        public int compare(SanPham o1, SanPham o2) {
                            if (o1.getPrice()< o2.getPrice()) {
                                return 1;
                            } else {
                                if (o1.getPrice()== o2.getPrice()) {
                                    return 0;
                                } else {
                                    return -1;
                                }
                            }
                        } 
                    });
                break;
            }
            
        }while(option !=6);
    }
    static void showMenu(){
        System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
        System.out.println("2. Xuất danh sách vừa nhập");
        System.out.println("3. Xuất danh sách ngẫu nhiên.");
        System.out.println("4. Sắp xếp giảm dần theo giá và xuất giá ra màn hình");
        System.out.println("5. Tìm và xóa sản phẩm theo tên nhập từ bàn phím.");
        System.out.println("6. Xuất giá trung bình của các sản phẩm");
    }
}
