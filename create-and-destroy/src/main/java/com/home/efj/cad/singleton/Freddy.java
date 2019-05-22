package com.home.efj.cad.singleton;

import lombok.extern.log4j.Log4j;

@Log4j
public class Freddy {

    private static final Freddy INSTANCE = new Freddy();

    private Freddy() { }

    public static Freddy getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        log.info("Freddy " + this.hashCode() + " leaves the building");
    }

}
