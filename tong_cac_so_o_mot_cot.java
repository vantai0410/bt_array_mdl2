package ss2_loop_array.bt_array_mdl2;

import java.util.Scanner;

public class tong_cac_so_o_mot_cot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so hang: ");
        int rows = sc.nextInt();
        System.out.print("nhap so cot: ");
        int cols = sc.nextInt();

        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập giá trị tại [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextDouble();
            }
        }

        System.out.print("nhap cot can tinh: ");
        int cotCanTinh = sc.nextInt();

        if(cotCanTinh == 0 || ){}

    }
}
