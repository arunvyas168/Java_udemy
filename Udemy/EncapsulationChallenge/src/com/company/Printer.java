package com.company;

/**
 * Created by arun on 3/27/16.
 */
public class Printer {
    private String printerName;
    private int totalNumberOfPages = 200;
    private int tonerLevelInPercent = 100;
    private String PrinterType;

    public Printer(String printerName, String printerType) {
        this.printerName = printerName;
        PrinterType = printerType;
    }

    public void Print (int numPages){
        if((numPages <= this.totalNumberOfPages)&&(isTonerEnough(numPages))){
            System.out.println("Printing "+numPages+" pages");
            this.totalNumberOfPages -= numPages;
            tonerUsed(numPages);
        }else{
            System.out.println("Too Many pages, no sufficient Toner or Pages");
        }

    }

    private void tonerUsed(int numpages){
        this.tonerLevelInPercent = this.tonerLevelInPercent - (numpages/2);
    }

    private boolean isTonerEnough(int numPages){
        if(this.tonerLevelInPercent >= (numPages/2)){
            return true;
        }
        return false;
    }

    public void RefillToner(int TonerRefil){
        if((TonerRefil+this.tonerLevelInPercent) <= 100){
            this.tonerLevelInPercent+=TonerRefil;
        } else {
            System.out.println("Toner will overflow, please enter a number less than or equal to "+(TonerRefil+this.tonerLevelInPercent));
        }
    }

    public int getTonerLevelInPercent() {
        return tonerLevelInPercent;
    }

    public int getTotalNumberOfPages() {
        return totalNumberOfPages;
    }
}
