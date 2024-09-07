package ss2_loop_array.bt_array_mdl2;

import java.util.Scanner;

public class ptu_lon_nhat_mang_hai_chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matrix = {
                {1.5, 3.2, 7.1},
                {4.0, 5.6, 9.3},
                {2.9, 8.7, 6.4}
        };
        double max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("gia tri lon nhat trong ma tr5an la: " + max);
        System.out.println("vị trí của nó là "+ maxRow + maxCol );
    }
}
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    // Hỏi kích thước của ma trận
//    System.out.print("Nhập số hàng của ma trận: ");
//    int rows = scanner.nextInt();
//    System.out.print("Nhập số cột của ma trận: ");
//    int cols = scanner.nextInt();
//
//    // Khởi tạo ma trận với kích thước người dùng nhập
//    double[][] matrix = new double[rows][cols];
//
//    // Thu thập giá trị của ma trận từ người dùng
//    for (int i = 0; i < rows; i++) {
//        for (int j = 0; j < cols; j++) {
//            System.out.print("Nhập giá trị tại [" + i + "][" + j + "]: ");
//            matrix[i][j] = scanner.nextDouble();
//        }
//    }
//
//    // Khai báo biến để lưu giá trị lớn nhất và tọa độ của nó
//    double max = matrix[0][0];
//    int maxRow = 0;
//    int maxCol = 0;
//
//    // Duyệt qua tất cả các phần tử trong ma trận
//    for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < matrix[i].length; j++) {
//            if (matrix[i][j] > max) {
//                max = matrix[i][j];
//                maxRow = i;
//                maxCol = j;
//            }
//        }
//    }
//
//    // Thông báo kết quả
//    System.out.println("Giá trị lớn nhất trong ma trận là: " + max);
//    System.out.println("Tọa độ của phần tử lớn nhất là: [" + maxRow + "][" + maxCol + "]");
//}
//}