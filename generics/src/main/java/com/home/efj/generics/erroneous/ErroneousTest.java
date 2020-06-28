package com.home.efj.generics.erroneous;

import com.google.common.collect.Sets;
import lombok.extern.log4j.Log4j;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Log4j
public class ErroneousTest {

    private ErroneousTest() {}

    public static void run() {
//        Collection stamps = new ArrayList();
        Collection<Stamp> stamps = new ArrayList<>();
        stamps.add(new Stamp("st1"));
        stamps.add(new Stamp("st2"));
//        stamps.add(new Coin(1));

        stamps.forEach(stamp -> {
            String stampViewRow = "Stamp with name: " + stamp.getName();
            log.info(stampViewRow);
        });

        List<Object> objs = new ArrayList<>();
        objs.add("bbb");
        objs.add(1);
        objs.add(LocalDateTime.now());
        RawVsParametrized.param(objs);

        List<String> strs = new ArrayList<>();
        strs.add("aaa");
        RawVsParametrized.rawAdd(strs, 1);
        RawVsParametrized.raw(strs);

//        strs.forEach(s -> {
//            String str = s;
//            log.info(s);
//        });

        Set<String> sstrs = new HashSet<>();
        sstrs.add("s1");
        int commonRaw = RawVsParametrized.numElementsInCommon(Sets.newHashSet("s1", "s2", 1), Sets.newHashSet(1, 2, 3));
        int commonUWT = RawVsParametrized.numElementsInCommonUWT(sstrs, Sets.newHashSet(1, 2, 3));

        log.info("common counted by raw: " + commonRaw);
        log.info("common counted by uwt: " + commonUWT);

        Collection set = new HashSet();
        set.add(12);
        set.add("aaa");

        Collection<?> setUWT = new HashSet<>();
        setUWT.add(null);
    }
}
