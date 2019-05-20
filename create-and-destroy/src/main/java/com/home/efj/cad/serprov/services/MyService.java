package com.home.efj.cad.serprov.services;

import com.home.efj.cad.serprov.services.api.Service;
import lombok.extern.log4j.Log4j;

@Log4j
public class MyService implements Service {

    @Override
    public void f1() {
        log.info(getClass().getSimpleName() + " f1");
    }

    @Override
    public void f2() {
        log.info(getClass().getSimpleName() + " f2");
    }
}
