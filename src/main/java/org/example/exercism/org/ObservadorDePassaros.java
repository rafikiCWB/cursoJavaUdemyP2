package org.example.exercism.org;

import java.util.Arrays;

import static java.lang.System.out;

public class ObservadorDePassaros {

    private int[] birdsPerDay = {0,2,5,3,7,8,4};

    public ObservadorDePassaros() {
    }

    public ObservadorDePassaros(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public int[] getLastWeek() {
       return new int[] {0,2,5,3,7,8,4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];

    }

    public static void main(String[] args) {
        var obs = new ObservadorDePassaros();
        out.println(obs.getToday());
        out.println(Arrays.toString(obs.getLastWeek()));
    }
}
