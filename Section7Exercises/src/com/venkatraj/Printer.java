package com.venkatraj;

public class Printer {
    private int tonerLevel = 100;
    private long pagesPrinted;
    private boolean isDuplex = false;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > 0 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void fillToner() {
        tonerLevel = 100;
    }

    public long getPagesPrinted() {
        return pagesPrinted;
    }

    public void print(int pagesToPrint) {
        for (int i = 0; i < pagesToPrint; i++) {
            if (isDuplex) {
                System.out.println("Printing double page....");
                this.pagesPrinted += 2;
                this.tonerLevel -= 2;
                i++;
            } else {
                System.out.println("Printing single page....");
                this.pagesPrinted++;
                this.tonerLevel -= 1;
            }
        }
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }
}
