package backjoon.step04;

import java.util.Scanner;

public class Q08_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resultArr[] = new String[sc.nextInt()];

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = sc.next();
        }

        for (String result : resultArr) {
            int score = 0;
            int cnt = 1;
            String arr[] = result.split("");

            for(String str : arr) {
                if (str.equals("O")) {
                    score += cnt++;
                } else {
                    cnt = 1;
                }
            }
            System.out.println(score);
        }
    }
}
