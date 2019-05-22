package com.home.efj.cad.singleton;

import java.lang.reflect.Constructor;

public class SingletonTest {

    public static void run() throws Exception {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();

//        Constructor<Elvis> elvisConstructor = (Constructor<Elvis>) Elvis.class.getDeclaredConstructors()[0];
//        elvisConstructor.setAccessible(true);
//        Elvis elvis1 = elvisConstructor.newInstance();
//        elvis1.leaveTheBuilding();
    }
}
