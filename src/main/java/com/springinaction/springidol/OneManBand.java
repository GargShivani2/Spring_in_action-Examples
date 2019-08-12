package com.springinaction.springidol;

import java.util.Map;
import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.Performer;

public class OneManBand implements Performer {

    public OneManBand()
    {

    }
    @Override
    public void perform() throws PerformanceException {
        for (String key: instruments.keySet())
        {
            System.out.println(key+ " : ");
            Instrument instrument = new instruments.get(key);
            instrument.play();
        }

    }
    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
