package com.home.efj.cad.serprov;

import com.home.efj.cad.serprov.providers.MyProvider;
import com.home.efj.cad.serprov.services.api.Service;
import com.home.efj.cad.serprov.services.api.Services;

public class ServiceProviderTest {

    private ServiceProviderTest() { }

    public static void run() {
        Services.registerDefaultProvider(new MyProvider());

        Service myService = Services.newInstance();

        myService.f1();
        myService.f2();
    }
}
