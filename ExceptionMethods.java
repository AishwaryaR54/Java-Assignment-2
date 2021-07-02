package com.assignment;

class CustomException extends Exception {
    CustomException() {
        System.out.println("This is a custom exception");
    }
}
public class ExceptionMethods {
    static void method2()
    {
        throw new NullPointerException();
    }
    static void method1() throws CustomException {
        try {
            method2();
            }
        catch (NullPointerException e)
        {
            throw new CustomException();
        }
    }
    public static void main(String[] args) {
        try {
            method1();
        } catch (CustomException e) {
        }
    }
}
