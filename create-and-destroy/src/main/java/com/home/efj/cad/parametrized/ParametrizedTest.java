package com.home.efj.cad.parametrized;

import lombok.extern.log4j.Log4j;

import java.util.Map;

@Log4j
public class ParametrizedTest {

    public static void run() {
        Map<String, Object> map = Maps.newInstance();
        map.put("1", "abc");

        log.info("my map:" + map);
    }
}
