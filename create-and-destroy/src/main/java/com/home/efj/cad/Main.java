package com.home.efj.cad;

import com.home.efj.cad.builder.BuilderTest;
import com.home.efj.cad.parametrized.ParametrizedTest;
import com.home.efj.cad.serprov.ServiceProviderTest;
import com.home.efj.cad.singleton.SingletonTest;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.PropertyConfigurator;

@Log4j
public class Main {

    public static void main(String[] args) throws Exception {
        PropertyConfigurator.configure(Main.class.getClassLoader().getResourceAsStream("log4j.properties"));

        new Main().run();
    }

    private void run() throws Exception {
        log.info("Creating and Destroying Objects...");

        ServiceProviderTest.run();
        ParametrizedTest.run();
        BuilderTest.run();
        SingletonTest.run();
    }
}
