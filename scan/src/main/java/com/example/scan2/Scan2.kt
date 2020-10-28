package com.example.scan2

import com.example.scan.Scan

class Scan2 {

    fun accessTest(){
        val scan = Scan()
        var scanNum1 = scan.scanNum1 // internal is ok
        var scanNum2 = scan.scanNum2 // protected is no access
        var scanNum3 = scan.scanNum3 // private is no access
        var scanNum4 = scan.scanNum4 // public is ok
    }

}