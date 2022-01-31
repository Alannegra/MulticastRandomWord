package com.company;

public class RandomWord {

    /* Classe que gestiona una dada de velocitat (int) aleatòria, per implementar l'exemple de Multicast:
     * ClientVelocimetre1.java
     * ClientVelocimetre2.java
     * SrvVelocitats.java
     */

    String[] array = new String[10];

    int vel,max;
    public RandomWord() {
        max = 10;
        array[0] = "Alan";
        array[1] = "Palabra";
        array[2] = "ou";
        array[3] = "Gol";
        array[4] = "asdsdd";
        array[5] = "ffffffff";
        array[6] = "Alaasdasdasn";
        array[7] = "sfaffasfasfasfas";
        array[8] = "Aasdasdsadasdasdasdlan";
        array[9] = "Alasdasdasdsadasdasdasdsadan";

    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public int agafaVelocitat() {
        //setVel((int)(Math.random()*max)+1);
        setVel((int)(Math.random()*max));
        return getVel();
    }

}