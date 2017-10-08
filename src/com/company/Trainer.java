package com.company;
import java.util.*;
/* This class is a dictionary of Java Terms*/

public class Trainer {
    public static void definition(){
        System.out.println("Enter a word: ");
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toLowerCase();
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("array", "A collection of data items, all of the same type, in which each item's position is uniquely designated by an integer.");
        dictionary.put("bit","The smallest unit of information in a computer, with a value of either 0 or 1.");
        dictionary.put("binary operator", "An operator that has two arguments.");
        dictionary.put("byte", "A sequence of eight bits. The Java(TM) programming language provides a corresponding byte type.");
        dictionary.put("class", "In the Java(TM) programming language, a type that defines the implementation of a particular kind of object. A class definition defines instance and class variables and methods, as well as specifying the interfaces the class implements and the immediate superclass of the class. If the superclass is not explicitly specified, the superclass will implicitly be Object.");

        while(!word.equals("quit")){
            String output = dictionary.get(word);
            System.out.println(output != null ? output:"word does not exist");
            System.out.println("Enter a word OR type 'quit' to leave ");
            word = scanner.nextLine().toLowerCase();
        }


    }
}
