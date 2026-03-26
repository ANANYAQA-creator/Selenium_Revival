package com.rawteananya.utils;

public class WaitHelper {

    // thread sleep
    public void thread_sleep(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Implicit wait

    // Explicit wait

    // Fluent wait


}
