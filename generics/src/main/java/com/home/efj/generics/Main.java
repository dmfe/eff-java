package com.home.efj.generics;

import com.home.efj.generics.erroneous.ErroneousTest;
import com.home.efj.generics.listandarrays.ListAndArraysTest;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.PropertyConfigurator;

@Log4j
public class Main {

    public static void main(String[] args) throws Exception {
        PropertyConfigurator.configure(Main.class.getClassLoader().getResourceAsStream("log4j.properties"));

        new Main().run();
    }

    private void run() throws Exception {
        log.info("Generics ...");
        ErroneousTest.run();
        ListAndArraysTest.run();
    }
}
