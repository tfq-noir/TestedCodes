package com.company;

public class OddsArbitrageSolvedArray {
    public static void main(String[] args) {
        int n = 77;
        int result = Q(n);
        System.out.println("Q(" +  n + ")="+result);
    }

    public static int Q(int n) {

        int[] arrQ = new int[n];
        arrQ[0] = 1;
        arrQ[1] = 1;
        for (int i = 2; i < arrQ.length; i++) {
            arrQ[i] = arrQ[i - arrQ[i - 1]] + arrQ[i - arrQ[i - 2]];

        }
        return arrQ[n -1];
    }
}


