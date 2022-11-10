package backjoon.step04;

import java.util.Scanner;

public class Q01_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        int cnt = 0;

        for (int arrNum : arr) {
            if(arrNum == v) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
