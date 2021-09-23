/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap1;

import java.util.Scanner;

/**
 *
 * @author 113
 */
public class Bai4 {
    public static void main(String[] args) {
        int sd = 0;
        int pay = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện:");
            sd = sc.nextInt();
            
        if(sd <= 50 ) {
            pay = sd*5000;
            System.out.printf("Tong tien la : " +pay);
        } else if(sd > 50){
            pay = 50*5000 + (sd-50)*6200;
             System.out.printf("Tong tien la : " +pay);

        }
}
}
