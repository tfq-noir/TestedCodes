package com.company;
/** Q(1) = 1, Q(2) = 1, and
 Q(n) = Q(n − Q(n − 1)) + Q(n − Q(n − 2)), for n > 2 */
public class MainSolved {
    public static void main(String[] args) {
        int n = 5;
        int result = q(n);

        System.out.println("q(" + n + ")=" + result);

    }

    public static int q(int n) {
        int result;
        if (n == 1 || n == 2) {
            return 1;
        } else if (n > 2) {
            return q(n - q(n - 1)) + q(n - q(n - 2));
        } else {
            return 0;
        }

    }
}