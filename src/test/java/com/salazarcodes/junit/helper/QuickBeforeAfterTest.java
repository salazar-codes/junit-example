package com.salazarcodes.junit.helper;

import org.junit.jupiter.api.*;

public class QuickBeforeAfterTest {

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeEach
    public void setup() {
        System.out.println("Before test");
    }

    @Test
    public void test1() {
        System.out.println("test1 executed");
    }

    @Test
    public void test2() {
        System.out.println("test2 executed");
    }

    @AfterEach
    public void teardown() {
        System.out.println("after test");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("after class");
    }
}
