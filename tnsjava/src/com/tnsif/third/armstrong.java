package com.tnsif.third;

public class armstrong {
    public static void main(String args[]) {
        int n = 153, sum = 0, m, r;
        m = n;  

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum += (int)Math.pow(r, 3); 
        }

        if (sum == m) {
            System.out.println(m + " is an Armstrong number");
        } else {
            System.out.println(m + " is not an Armstrong number");
        }
    }
}
