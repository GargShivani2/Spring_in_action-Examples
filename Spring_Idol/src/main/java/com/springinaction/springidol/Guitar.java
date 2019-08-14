package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {

    public Guitar()
    {

    }
    @Override
    public void play() {
        System.out.println("Playing Guitar chi chi chi chi");
    }
}
