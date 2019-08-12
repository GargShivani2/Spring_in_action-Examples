package com.springinaction.springidol;

public class SaxoPhone implements Instrument{
    public SaxoPhone()
    {

    }

    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }

}