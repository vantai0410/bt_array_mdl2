package ss2_loop_array.bt_array_mdl2;

import java.util.Scanner;

public class gtnn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp so luong phan tu");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("nhap cac phan tu trong mang");
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu thu " + (i+1));
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("gia tri nho nhat trong mang la: " +min);
    }
}
