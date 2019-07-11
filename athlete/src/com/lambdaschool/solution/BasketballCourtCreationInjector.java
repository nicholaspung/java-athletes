package com.lambdaschool.solution;

public class BasketballCourtCreationInjector implements  CourtCreationInjector {
    @Override
    public Processor getProcess() {
        return new MyApplication(new BasketballCourtCreationImpl());
    }
}
