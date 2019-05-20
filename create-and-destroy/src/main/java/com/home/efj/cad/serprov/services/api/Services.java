package com.home.efj.cad.serprov.services.api;

import com.home.efj.cad.serprov.providers.api.Provider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {

    public static final String DEFAULT_PROVIDER_NAME = "def-provider";

    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();

    private Services() { }

    // Provider registration API
    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    // Service access API
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException("No service provider registered with name: " + name);
        }
        return p.newService();
    }
}
