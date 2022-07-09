package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberGenerator {
    ArrayList <Person>lista = new ArrayList<>();
    int ileUczniow;
    int ileLosujemy;


    NumberGenerator (String plik,int ileUczniow,int ileLosujemy)throws IleLosujemyWiekszeOdilosci{
        if(ileUczniow>=ileLosujemy){
        this.ileUczniow=ileUczniow;
        this.ileLosujemy=ileLosujemy;

        initialize(plik);}
        else {
            throw new IleLosujemyWiekszeOdilosci("Nie mozna tak losowac");
        }

    }


   private void initialize(String nazwa){
        File file = new File(nazwa);
       Scanner scanner = null;
       try {
           scanner = new Scanner(file);

       } catch (FileNotFoundException e) {

           e.printStackTrace();
       }


       while(scanner.hasNext()){
lista.add(new Person(scanner.next(),scanner.next()));

       }

    }
    public void start(){

        for (int i = 0; i <ileLosujemy ; i++) {
            int liczba = (int)(Math.random()* lista.size());
            System.out.println(lista.get(liczba));
            lista.remove(liczba);


        }

    }


}
