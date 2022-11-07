package backjoon.step03;

import java.util.Scanner;

public class Q04_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 총 금액
        int n = sc.nextInt(); // 구매한 물건의 종류의 수

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // 물건의 가격
            int b = sc.nextInt(); // 물건의 개수

            x -= a * b;
        }

        System.out.println(x == 0 ? "Yes" : "No");
    }
}
