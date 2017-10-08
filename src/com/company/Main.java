package com.company;
import java.util.*;
import java.util.Scanner;
/*This Main launches my program for: Java Trainer, Java Quiz, or Quit*/

public class Main {

    public static void main(String[] args) {
        promptUser();
        Scanner scanner = new Scanner(System.in);
        startProgram(scanner);
    }
    private static void promptUser(){
        System.out.println();
        System.out.println("Welcome to Java-Trainer 1.0: Please select one of the following");
        System.out.println("1: Java Trainer: Input a term for it's definition");
        System.out.println("2: Java Quiz: Answer 5 Java Questions");
        System.out.println("3: Quit");
    }

    public static void startProgram(Scanner scanner) {
        while(scanner.hasNext()){
            boolean quit = false;
            int choice = 0;
            String error = "Please print a number";

            try{
                choice = Integer.parseInt(scanner.next());
            }catch (NumberFormatException e){
                System.out.println(error);
                promptUser();
            }
            if(choice > 0 && choice <=3){
                if(choice == 1){
                    System.out.println("Selected Java Trainer!");
                    Trainer.definition();
                    break;
                }
                else if(choice == 2){
                    System.out.println("Selected Java Quiz");
                    JavaQuiz.solveQuiz();
                    break;
                }else if(choice == 3){
                    System.out.println("Good Bye");
                    quit = true;
                }
            }else if(choice > 3){
                System.out.println("print valid num");
                promptUser();
            }else{
                continue;
            }
            if(quit){
                break;
        }
        }

    }
}
