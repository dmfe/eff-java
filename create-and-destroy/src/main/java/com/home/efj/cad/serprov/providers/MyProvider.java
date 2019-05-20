package com.home.efj.cad.serprov.providers;

import com.home.efj.cad.serprov.providers.api.Provider;
import com.home.efj.cad.serprov.services.MyService;
import com.home.efj.cad.serprov.services.api.Service;

public class MyProvider implements Provider {

    @Override
    public Service newService() {
        return new MyService();
    }
}
