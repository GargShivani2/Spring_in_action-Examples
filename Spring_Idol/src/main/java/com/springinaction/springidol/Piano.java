package com.springinaction.springidol;

public class Piano implements Instrument {
    public Piano()
    {

    }
    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
