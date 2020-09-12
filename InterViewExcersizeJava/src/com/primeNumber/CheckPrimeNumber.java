package com.primeNumber;

public class CheckPrimeNumber {
    public static void main(String[] args) {

        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();

        checkPrimeNumber.checkPrimeWithWhileLoop();
        checkPrimeNumber.checkPrimeWithForLoop();

    }


    void checkPrimeWithForLoop() {
        int num = 29;
        boolean flag = false;

        for (int i = 2; i <= num / 2; ++i) {
            // Condition for prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println(num + " Is a prime number ");
        } else {
            System.out.println(num + " Is not a prime number ");
        }
    }


    void checkPrimeWithWhileLoop() {
        int num = 33, i = 2;
        boolean flag = false;
        while (i <= num / 2) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
            ++i;
        }
        if (!flag) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }


}
