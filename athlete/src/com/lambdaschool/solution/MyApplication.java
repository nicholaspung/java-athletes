package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    private AthleteCreation athlete;

    public MyApplication(AthleteCreation athlete) {
        this.athlete = athlete;
    }

    public void displayAthlete()
    {
        System.out.println("************");
        System.out.println("Athlete");
        System.out.println("************\n");
    }
}
