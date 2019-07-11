package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    private AthleteCreation athlete;
    private CourtCreation court;

    public MyApplication(AthleteCreation athlete) {
        this.athlete = athlete;
    }

    public MyApplication(CourtCreation court) {
        this.court = court;
    }

    @Override
    public void displayAthlete()
    {
        System.out.println("************");
        athlete.displayAthlete();
        System.out.println("************\n");
    }

    @Override
    public void displayCourt()
    {
        System.out.println("************");
        court.displayCourt();
        System.out.println("************\n");
    }
}
