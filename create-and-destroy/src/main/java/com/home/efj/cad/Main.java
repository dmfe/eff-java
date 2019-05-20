package com.home.efj.cad;

import com.home.efj.cad.serprov.ServiceProviderTest;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.PropertyConfigurator;

@Log4j
public class Main {

    public static void main(String[] args) {
        PropertyConfigurator.configure(Main.class.getClassLoader().getResourceAsStream("log4j.properties"));

        new Main().run();
    }

    private void run() {
        log.info("Creating and Destroying Objects...");

        ServiceProviderTest.run();
    }
}
