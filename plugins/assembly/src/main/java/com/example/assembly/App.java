package com.example.assembly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App 
{
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args){

        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("Hello World");
    }
}
