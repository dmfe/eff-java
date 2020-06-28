package com.home.efj.generics.erroneous;

import lombok.extern.log4j.Log4j;

import java.util.List;
import java.util.Set;

@Log4j
class RawVsParametrized {

    private RawVsParametrized() {
    }

    static void param(List<Object> objs) {
        objs.forEach(log::info);
    }

    static void raw(List objs) {
        objs.forEach(log::info);
    }

    static void rawAdd(List objs, Object o) {
        objs.add(o);
    }

    static int numElementsInCommon(Set s1, Set s2) {
        int result = 0;
        for (Object o1 : s1) {
            if (s2.contains(o1)) {
                result++;
            }
        }
        return result;
    }


    static int numElementsInCommonUWT(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object o1 : s1) {
            if (s2.contains(o1)) {
                result++;
            }
        }
        return result;
    }
}
