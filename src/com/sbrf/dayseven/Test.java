package com.sbrf.dayseven;

@Plugin
public class Test {

    @RunMe
    public void method1() {
        System.out.println("method1() was started");
    }

    @RunMe
    private void method2() {
        System.out.println("method2() was started");
    }
}
