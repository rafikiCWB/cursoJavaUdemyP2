package org.example.exercism.org;

public class Lasagna {
    private final static int EXPECTED_MINUTES_IN_OVEN = 40;
    private final static int PREPARATION_NUMBER_OF_LAYERS = 2;

    /**
     * Define the expectedMinutesInOven() method that does not take any parameters and returns how many minutes
     * the lasagna should be in the oven. According to the cooking book, the expected oven time in minutes is 40:
     *
     * @return
     */
    private int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    /**
     * Define the remainingMinutesInOven() method that takes the actual minutes the lasagna has been in the oven
     * as a parameter and returns how many minutes the lasagna still has to remain in the oven, based on the
     * expected oven time in minutes from the previous task.
     *
     * @param actualMinutesInOven
     * @return
     */
    private int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    /**
     * Define the preparationTimeInMinutes() method that takes the number of layers you added to the lasagna as a
     * parameter and returns how many minutes you spent preparing the lasagna, assuming each layer takes you 2 minutes
     * to prepare.
     *
     * @param numberOfLayers
     * @return
     */
    private int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * PREPARATION_NUMBER_OF_LAYERS;
    }

    /**
     * Define the totalTimeInMinutes() method that takes two parameters: the first parameter is the number of layers
     * you added to the lasagna, and the second parameter is the number of minutes the lasagna has been in the oven.
     * The function should return how many minutes in total you've worked on cooking the lasagna, which is the sum of the
     * preparation time in minutes, and the time in minutes the lasagna has spent in the oven at the moment
     *
     * @param numberOfLayers
     * @param actualMinutesInOven
     * @return
     */
    private int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        var preparationTime = preparationTimeInMinutes(numberOfLayers);
        return preparationTime + actualMinutesInOven;
    }


    public static void main(String[] args) {
        int explictVat = 10;
        explictVat =20;
        System.out.println(explictVat);
        Lasagna lasagna = new Lasagna();

        int expectedMinutesInOven = lasagna.expectedMinutesInOven();
        System.out.println(expectedMinutesInOven);

        Integer remainingMinutesInOven = lasagna.remainingMinutesInOven(30);
        System.out.println(remainingMinutesInOven);

        var preparationTimeInMinutes = lasagna.preparationTimeInMinutes(2);
        System.out.println(preparationTimeInMinutes);

        var totalTimeInMinutes = lasagna.totalTimeInMinutes(3, 20);
        System.out.println(totalTimeInMinutes);
    }
}
