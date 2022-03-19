package com.harman.java;
import java.io.FileInputStream;


public class Read {
    public static void main(String[] args) {
        try {
            FileInputStream r=new FileInputStream("sample.txt");
            int a=0,A=0,E=0,I=0,O=0,U=0;
            while((a=r.read())!=-1) {
                if(a=='A') {
                    A++;
                }
                else if(a=='E') {
                    E++;
                }
                else if(a=='I') {
                    I++;
                }
                else if(a=='O') {
                    O++;
                }
                else if(a=='U') {
                    U++;
                }
            }
            System.out.println("A :"+A);
            System.out.println("E :"+E);
            System.out.println("I :"+I);
            System.out.println("O :"+O);
            System.out.println("U :"+U);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}



