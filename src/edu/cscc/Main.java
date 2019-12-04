package edu.cscc;

import java.io.File;
import java.util.Set;

//Corey Capelle, 12/3/2019, CSCI-2467 Lab 12 – Finding Unique Words in a Document

public class Main {
    private static final String fname = "AtTheMountainsOfMadness_HP_Lovecraft.txt";

    public static void main(String[] args) {
        File myfile = new File(fname);
        Set<String> uniques = UniqueWords.processDocument(myfile);
        for (String s : uniques) {
            System.out.println(s);
        }
        System.out.println("Got "+uniques.size()+" words");
    }
}
