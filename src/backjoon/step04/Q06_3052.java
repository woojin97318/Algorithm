package backjoon.step04;

import java.util.*;

public class Q06_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>(); // 중복x, 정렬x
//        TreeSet<Integer> set = new TreeSet<>(); // 중복x, 정렬o

        for(int i = 0; i < 10; i++) {
            set.add(sc.nextInt() % 42);
        }

        System.out.println(set.size());
    }
}
