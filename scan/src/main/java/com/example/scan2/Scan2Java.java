package com.example.scan2;

import com.example.scan.Scan;
import com.example.scan.ScanJava;

public class Scan2Java {
    ScanJava scanJava = new ScanJava();

    public void accessTest(){
        String string1 = scanJava.pub_var;   //ok
        String string2 = scanJava.prot_var;  //ng
        String string3 = scanJava.pac_var;   //ng
        String string4 = scanJava.pri_var;   //ng
    }

}
