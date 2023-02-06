package com.bridgelabz;

public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator Program");
        int stake = 100;
        int bet = 1;

        double Betting = Math.floor(Math.random()*100)%2;
        if (Betting ==bet) {
            stake++;
            System.out.println("Gambler is winning $1");
            System.out.println("stake = " +stake);
        }
        else {
            stake--;
            System.out.println("Gambler is loosing");
            System.out.println("stake = " +stake);
        }
    }
}
