import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // đặt tên biến hơi khác so với hướng dẫn trong học liệu

        System.out.println("Nhập số lượng số nguyên tố: ");
        int N = sc.nextInt();   // số lượng muốn in
        int count = 0;          // đếm số lượng đã in ra
        int number = 2;         // số hiện tại (cần kiểm tra xem có phải số nguyên tố)

        while (count < N) {
            if (isPrime(number)) {
                count++;
                System.out.printf("%d  ", number);
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
