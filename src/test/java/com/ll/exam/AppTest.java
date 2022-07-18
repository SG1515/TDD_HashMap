package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
}

class HashMapTest {
    @Test
    void get() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("철수", 22);
        int age = ages.get("철수");

        assertEquals(22, age);
    }

    @Test
    void put() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("철수", 22);
    }

    @Test
    void 클래스가_존재한다() {
        HashMap map = new HashMap();
    }

    @Test
    void 제너릭이_가능하다() {
        HashMap<String, Integer> map = new HashMap<>();
    }



}