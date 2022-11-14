package backjoon.step04;

import java.util.Scanner;

public class Q09_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr; // 배열 선언

        int c = sc.nextInt(); // testCase num

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt(); // 학생 수
            arr = new int[n];

            int sum = 0; // 성적 합계
            double average = 0.0d; // 성적 평균

            for (int j = 0; j < n; j++) {
                int score = sc.nextInt();
                arr[j] = score;
                sum += score;
            }
            average = (double)sum / n;

            int cnt = 0; // 평균이 넘는 학생 수
            for (int j = 0; j < n; j++) {
                if (arr[j] > average) {
                    cnt++;
                }
            }

            System.out.println(String.format("%.3f%%", (double)cnt / n * 100));
        }
    }
}
