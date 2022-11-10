package backjoon.step03;

import java.util.Scanner;

public class Q12_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nextN = n;
        int cnt = 0;

        while (true) {
            if (nextN < 10) {
                nextN += nextN * 10;
            } else {
                int a = nextN / 10; // 10의 자리
                int b = nextN % 10; // 1의 자리
                nextN = b*10 + (a+b)%10;
            }

            cnt++;

            if (n == nextN) {
                System.out.println(cnt);
                break;
            }
        }
    }
}
