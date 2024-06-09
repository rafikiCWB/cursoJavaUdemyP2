package org.example.exercism.org;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        // você tem que pegar valor do 'speed' * 221 * successRate
        double successRate;
        if (speed >= 1 && speed <=4) {
            successRate = 1.0;
        }else if (speed >= 5 && speed <=8) {
            successRate = 0.9;
        } else if (speed == 9) {
            successRate = 0.8;
        } else {
            successRate = 0.77;
        }
        return speed * 221 * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        // Você tem que pegar o metodo productionRatePerHour / 60
        var workingPerMinute = new CarsAssemble();
        return (int) workingPerMinute.productionRatePerHour(speed) / 60;

    }

    public static void main(String[] args) {
        CarsAssemble carsAssemble = new CarsAssemble();
        System.out.println(carsAssemble.productionRatePerHour(6));
        System.out.println(carsAssemble.workingItemsPerMinute(6));
    }
}
