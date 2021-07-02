package com.assignment;

import java.util.Scanner;

class NotASquareException extends Exception {
    NotASquareException()
    {
        System.out.println("It is not a square");
    }
}

public class Shape {
    int length, width;
    boolean isSquare() throws NotASquareException {
        if (length == width) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        Shape s = new Shape();
        s.length = sc.nextInt();
        System.out.println("Enter the width: ");
        s.width = sc.nextInt();
        try {
            if (s.isSquare()) {
                System.out.println("It is a square");
            }
            else {
                throw new NotASquareException();
            }
        } catch (NotASquareException e) {
        }
    }
}

