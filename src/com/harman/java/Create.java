package com.harman.java;

import java.io.FileWriter;

public class Create {
    public static void main(String[] args) {
        try {
            FileWriter w =new FileWriter("sample.txt");
            w.write("HAPPY NEW YEAR");
            w.close();
            System.out.println("file created successfully");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
