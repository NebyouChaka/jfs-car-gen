package com.example.car_gen;

public class Main {
    public static void main(String[] args){
    Honda civic = new Honda("black", 2021, 180, true);
    Toyota supra = new Toyota("red", 2021, 180, true);
    Lexus rx350 = new Lexus("yellow", 2021, 180, true);
    civic.acceleratedSpeed();
    Lexus.acceleratedSeed(rx350);
        System.out.println(civic.getColor());
        System.out.println(supra.getColor());
        System.out.println(rx350.getColor());
        System.out.println(rx350.getYear());
    }
}

