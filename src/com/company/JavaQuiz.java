package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
/*This class quizzes you on your Java knowledge*/

public class JavaQuiz {
    public static void printAnswers(ArrayList<String> arrayInput) {
        for (int i = 0; i < arrayInput.size(); i++) {
            System.out.println(arrayInput.get(i));
        }
    }
    public static boolean correctAnswer(int caseNum, int answer) {
        HashMap<Integer, Integer> arrNum = new HashMap();
        arrNum.put(1, 2);
        arrNum.put(2, 4);
        arrNum.put(3, 3);
        arrNum.put(4, 1);
        arrNum.put(5, 4);
        if (arrNum.get(caseNum) == answer) {
            return true;
        } else {
            return false;
        }
    }
    public static void solveQuiz() {
        int counter = 0;
        ArrayList<String> questions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer the following 5 questions: ");

        int count = 1;
        switch (count) {
            case 1:
                System.out.println("Choose the best definition of an object?");

                questions.add("1: A thing");
                questions.add("2: An instance of the class");
                questions.add("3: Something you wear");
                printAnswers(questions);
                if (correctAnswer(1, scanner.nextInt())) {
                    counter++;
                }
            case 2:
                System.out.println("Choose the appropriate data type for this field: numberOfEggs!");//answer=4;
                questions.clear();
                questions.add("1: Char");
                questions.add("2: Boolean");
                questions.add("3: Double");
                questions.add("4: Int");
                printAnswers(questions);
                if (correctAnswer(2, scanner.nextInt())) {
                    counter++;
                }
            case 3:
                System.out.println("Choose the appropriate data type for this value: A");//answer=3;");
                questions.clear();
                questions.add("1: Double");
                questions.add("2: Int");
                questions.add("3: Char");
                questions.add("4: String");
                printAnswers(questions);
                if (correctAnswer(3, scanner.nextInt())) {
                    counter++;
                }
            case 4:
                System.out.println("A class cannot be declared:");   //\n1: Private\n2: Default\\n3: Static\"); //answer=1;
                questions.clear();
                questions.add("1: Private");
                questions.add("2: Default");
                questions.add("3: Static");
                printAnswers(questions);
                if (correctAnswer(4, scanner.nextInt())) {
                    counter++;
                }
            case 5:
                System.out.println("An object could be ...");//answer=4;
                questions.clear();
                questions.add("1: A program");
                questions.add("2: A data container");
                questions.add("3: An algorithm");
                questions.add("4: Anything");
                printAnswers(questions);
                if (correctAnswer(5, scanner.nextInt())) {
                    counter++;
                }
                System.out.println("Well Done! You've scored: " + counter + " out of 5.");
        }
    }
}
