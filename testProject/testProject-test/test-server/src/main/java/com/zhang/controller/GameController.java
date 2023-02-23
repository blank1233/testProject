package com.zhang.controller;

import model.Hero;
import model.Skill;

public class GameController {

    public static void main(String[] args) {
        Hero wrw = null;
        wrw = new Hero("维尔薇", 40, 6, 10, 20, new Skill() {
            public void active() {
                /*if (){

                }*/
            }

            public void passive() {

            }
        });


    }
}
