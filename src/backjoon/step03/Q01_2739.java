package backjoon.step03;

import java.util.Scanner;

public class Q01_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= 9; i++) {
            System.out.println(String.format("%d * %d = %d", n, i, n * i));
        }
    }
}
