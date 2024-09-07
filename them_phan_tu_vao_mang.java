package ss2_loop_array.bt_array_mdl2;

import java.util.Scanner;

public class them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5};
        int n = numbers.length;
        System.out.println("nhap phan tu can them ");
        int x = sc.nextInt();
        System.out.println("nhap vị trí cần thêm ");
        int index_add = sc.nextInt();
        if (index_add <= -1 || index_add >= n - 1) {
            System.out.println("ko chen duoc");
        } else {
            int[] new_array = new int[n + 1];
            for (int i = 0; i < index_add; i++) {
                new_array[i] = numbers[i];
            }
            new_array[index_add] = x;
            // sao chep phần phía sau index, nên dùng i+1
            for (int i = index_add; i < n; i++) {
                new_array[i + 1] = numbers[i];
            }

            System.out.println("Mảng sau khi chèn phần tử:");
            for (int i = 0; i < new_array.length; i++) {
                System.out.print(new_array[i] + " ");
            }
        }
    }
}
