package com.example.viewing

import com.example.bgm.Bgm

class Viewing {

    fun accessTest(){
        val bgm = Bgm()
        var viewingNum1 = bgm.bgmNum1 // internal is no access
        var viewingNum2 = bgm.bgmNum2 // protected is no access
        var viewingNum3 = bgm.bgmNum3 // private is no access
        var viewingNum4 = bgm.bgmNum4 // public is ok
    }

}