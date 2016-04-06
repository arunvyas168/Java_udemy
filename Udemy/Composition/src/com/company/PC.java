package com.company;

/**
 * Created by arun on 3/26/16.
 */
public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.motherboard = motherboard;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

}
