package dev.pkj.javabackendlld.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        fun();

    }

    private static void fun() {
        try {
            System.out.println("Hello");
            System.out.println("Scaler");

//            File file = new File("abc.txt");
//            System.out.println("Hi");
//            FileReader fileReader = new FileReader(file);
//            fileReader.read();

            Scanner sc = new Scanner(System.in);
            System.out.println("hi");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Bangalore");
            int c = a/b;
        }
//        catch(FileNotFoundException e) {
//            System.out.println("File not found exception");
//        }
//        catch(IOException e ) {
//            System.out.println("IO exception occurred");
//        }
        catch(InputMismatchException e) {
            System.out.println("Input mismatch expception");
        }
        catch(ArithmeticException e) {
            System.out.println("Arithematic Exception has occured");
        }
        catch (Exception e) {
            System.out.println("Exception has occured");
        } finally {
            System.out.println("Finally block");
            // finally block get executed even we are having return statement
        }

        System.out.println("After try catch & Finally");
    }
}
