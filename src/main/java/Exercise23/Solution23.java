/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise23;

import java.util.Scanner;

public class Solution23
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        char decision;

        System.out.print("Let's try to troubleshoot your car issue.");

        System.out.print("Is the car silent when you turn the key? ");
        decision = scan.next().charAt(0);

        if (decision == 'y' || decision == 'Y')
        {
            System.out.print("Are the battery terminals corroded? ");
            decision = scan.next().charAt(0);

            if (decision == 'y' || decision == 'Y')
                System.out.println("Clean the terminals and try starting again.");

            else
                System.out.println("Replace cables and try again");
        }
        else
        {
            System.out.print("Does the car make a slicking noise? ");
            decision = scan.next().charAt(0);

            if (decision == 'y' || decision == 'Y')
                System.out.println("Replace the Battery.");

            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                decision = scan.next().charAt(0);

                if (decision == 'y' || decision == 'Y')
                    System.out.println("Check spark plug connection.");

                else
                {
                    System.out.print("Does the engine start and then die? ");
                    decision = scan.next().charAt(0);

                    if (decision == 'y' || decision == 'Y') {
                        System.out.println("Does your car have fuel injection? ");
                        decision = scan.next().charAt(0);

                        if (decision == 'y' || decision == 'Y')
                            System.out.println("Get in it for service.");

                        else
                            System.out.println("Check to ensure the choke is opening and closing.");

                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
