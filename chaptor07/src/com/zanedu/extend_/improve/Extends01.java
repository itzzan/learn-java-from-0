package com.zanedu.extend_.improve;

import com.zanedu.extend_.Graduate;
import com.zanedu.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        com.zanedu.extend_.Pupil pupil = new Pupil();
        pupil.name = "小明~";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(50);
        pupil.showInfo();

        System.out.println("======================");
        com.zanedu.extend_.Graduate graduate = new Graduate();
        graduate.name = "大强~";
        graduate.age = 21;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
