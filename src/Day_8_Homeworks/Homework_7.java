package Day_8_Homeworks;

import java.util.Scanner;

public class Homework_7 {

    /**
     *John and Mike both play basketball in different teams. In the latest 3 games, John's team scored 89,
     * 120 and 103 points, while Mike's team scored 116, 94, and 123 points.

     * 1. Calculate the average score for each team.
     *
     * 2. Decide which teams wins in average (highest average score), and print the winner to the console with if else statement.
     * Also include the average score in the output.
     *
     * 3. Then change the scores to show different winners.
     * Don't forget to take into acount there might be a draw (the same average score).
     */

    public static void main(String[] args) {

        int JohnTeam1=89;
        int JohnTeam2=120;
        int JohnTeam3=103;

        int MikeTeam1=116;
        int MikeTeam2=94;
        int MikeTeam3=123;

        double averageJohnTeam= ((+JohnTeam1+JohnTeam2+JohnTeam3)/3);
        double averageMikeTeam= ((MikeTeam1+MikeTeam2+MikeTeam3)/3);
        System.out.println("The average of John Team is: " +averageJohnTeam);
        System.out.println("The average of John Team is: " +averageMikeTeam);

        if (averageJohnTeam>averageMikeTeam) {
            System.out.println("The winner is John`s Team with the score of " +averageJohnTeam);
        } else if (averageMikeTeam>averageJohnTeam) {
            System.out.println("The winner is Mike`s Team with the score of" +averageMikeTeam);
        } else {
            System.out.println("Both of them have the same average score");
        }
    }






}



