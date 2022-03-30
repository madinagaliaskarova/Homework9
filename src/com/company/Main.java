package com.company;

public class Main {

    public static void main(String[] args) {
        Shelter romashka = new Shelter("Romashka" , "Pervomayskaya 19");
        Dog rex = new Dog("Rex", "Ovcharka", new String[]{ "Сидеть", "Лежать"},
                ColorEnum.BROWN, romashka);
        System.out.println(rex.getInfo());
        rex.makeVoice();
        rex.makeVoice("Гув гув");


        Shelter kotopes = new Shelter("kotopes", " Djety-Oguz 8");
        Dog Rex2 = new Dog("Romashka", "Shpic",  ColorEnum.WHITE, kotopes);
        System.out.println(Rex2.getInfo());





}


    }

