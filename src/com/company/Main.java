package com.company;

public class Main {

    public static void main(String[] args) {

        NumberGenerator numberGenerator= null;
        try {
            numberGenerator = new NumberGenerator("uczniowie.txt",4,3);

        } catch (IleLosujemyWiekszeOdilosci e) {
            e.printStackTrace();


        }

        numberGenerator.start();



    }
}
