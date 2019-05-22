package com.home.efj.cad.singleton;

import lombok.extern.log4j.Log4j;

@Log4j
public class Elvis {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
        if (INSTANCE != null) {
            throw new UnsupportedOperationException("Can not create instance of " + getClass().getName());
        }
    }

    public void leaveTheBuilding() {
        log.info("Elvis " + this.hashCode() + " leaves the building");
    }
}
