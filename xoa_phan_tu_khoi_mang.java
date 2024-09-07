package ss2_loop_array.bt_array_mdl2;

import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5};
        int n = numbers.length;
        System.out.println("nhap phan tu can xoa");
        int x = sc.nextInt();
        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == x) {
                index_del = i;
                break;
            }
        }
        for (int i = index_del; i < n - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        n--;
        System.out.print("Mảng sau khi xoá phần tử: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}




