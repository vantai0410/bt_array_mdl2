package ss2_loop_array.bt_array_mdl2;

import java.util.Scanner;

public class tinh_tong_cac_duong_cheo_cua_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Nhập số hàng của ma trận: ");
    int rows = sc.nextInt();
    System.out.print("Nhập số cột của ma trận: ");
    int cols = sc.nextInt();

    double[][] matrix = new double[rows][cols];


    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print("Nhập giá trị tại [" + i + "][" + j + "]: ");
            matrix[i][j] = sc.nextDouble();
        }
    }
    double tongDuongCheo = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    tongDuongCheo += matrix[i][j];
                }
            }
        }
        System.out.println("tong duong cheo chinh la: " + tongDuongCheo);
    }
}
