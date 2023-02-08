package com.cydeo.tests.teamAlsephina;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {

        Properties properties=new Properties();
        FileInputStream file=new FileInputStream("configuration.properties");
        properties.load(file);
        System.out.println("properties.isEmpty() = " + properties.isEmpty());
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        // System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));


    }
}
