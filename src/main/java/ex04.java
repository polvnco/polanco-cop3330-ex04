/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */


import java.util.Scanner;

public class ex04
{
    public static void main( String[] args )
    {
        Scanner madInput = new Scanner(System.in);

        //Enter the words here
        System.out.print("Enter a noun: ");
        String noun = madInput.nextLine();
        System.out.print("Enter a verb: ");
        String verb = madInput.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = madInput.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = madInput.nextLine();

        System.out.print("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");

    }
}
