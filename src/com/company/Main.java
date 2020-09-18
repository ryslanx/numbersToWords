package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(100);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if(number == 0) {
            System.out.println("Zero");
        } else {
            int reverseNumber = reverse(number);
            int originalNumberDigitCount = getDigitCount(number);
            int reverseDigitCount = getDigitCount(reverseNumber);
            int lastDigit = 0;
            while(reverseNumber != 0) {
                lastDigit = reverseNumber % 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reverseNumber /= 10;
            }
            if (originalNumberDigitCount != reverseDigitCount) {
                for (int i = 0; i < (originalNumberDigitCount - reverseDigitCount); i++) {
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber *= 10;
            reversedNumber += number % 10;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return  -1;
        } else if (number == 0) {
            return 1;
        }
        int digitQuantity = 0;
        int lastDigit = 0;
        while (number != 0) {
            digitQuantity++;
            number /= 10;
        }
        return digitQuantity;
    }





}
