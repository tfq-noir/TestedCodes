package com.company;

public class FromStackO {
    /**
     * Q(1) = 1, Q(2) = 1, and
     * Q(n) = Q(n − Q(n − 1)) + Q(n − Q(n − 2)), for n > 2
     */

    public static void main(String[] args) {
        System.out.println("q(77) = " + Hofstadter(5));
    }

    public static int Hofstadter(int n) {
        int result;

        if (n < 3)
            result = 1;
        else
            result = Hofstadter(n - (Hofstadter(n - 1))) + Hofstadter(n - (Hofstadter(n - 2)));
        return result;
    }
}