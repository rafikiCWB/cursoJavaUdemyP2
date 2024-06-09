package org.example.exercism.org;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.*;

public class CarsAssembleTest {
    private static final Logger logger = Logger.getLogger(CarsAssembleTest.class.getName());

    private CarsAssemble carsAssemble;
    /**
     * Adicionar ou subtrair epsilon de um double ajuda a garantir que as comparações de igualdade
     * sejam verdadeiras quando os números são "praticamente iguais".
     */
    private double epsilon = 0.0000001d;

    @BeforeEach
    public void setUp() {
        carsAssemble = new CarsAssemble();
    }

    @Test
    @Tag("task:1")
    @DisplayName("The productRatePerHour method returns the correct result when line's speed is 0")
    public void productionRatePerHourForSpeedZero() {
        assertThat(carsAssemble.productionRatePerHour(0)).isCloseTo(0.0, within(epsilon));
        logger.info("Production rate per hour for speed 0: " + carsAssemble.productionRatePerHour(0));
    }

    @Test
    @Tag("Taks:1")
    @DisplayName("The productRatePerHour method return the correct result when line's speed is 1")
    public void productionRatePerHourForSpeedOne() {
        assertThat(carsAssemble.productionRatePerHour(1)).isCloseTo(221.0, within(epsilon));
        logger.info("Production rate per hour for speed 1: " + carsAssemble.productionRatePerHour(1));

    }

    @Test
    @Tag("Taks:1")
    @DisplayName("The productRatePerHour method return the correct result when line's speed is 5")
    public void productionRatePerHourForSpeedFour() {
        assertThat(carsAssemble.productionRatePerHour(5)).isCloseTo(994.5, within(epsilon));
        logger.info("Production rate per hour for speed 5: " + carsAssemble.productionRatePerHour(5));

    }

    @Test
    @Tag("Taks:1")
    @DisplayName("The productRatePerHour method return the correct result when line's speed is 9")
    public void productionRatePerHourForSpeedSeven() {
        assertThat(carsAssemble.productionRatePerHour(9)).isCloseTo(1591.2, within(epsilon));
        logger.info("Production rate per hour for speed 9: " + carsAssemble.productionRatePerHour(9));

    }

    @Test
    @Tag("Taks:1")
    @DisplayName("The productRatePerHour method return the correct result when line's speed is 10")
    public void productionRatePerHourForSpeedNine() {
        assertThat(carsAssemble.productionRatePerHour(10)).isCloseTo(1701.7, within(epsilon));
        logger.info("Production rate per hour for speed 10: " + carsAssemble.productionRatePerHour(10));

    }

    @Test
    @Tag("Task:1")
    @DisplayName("The workingItemsPerMinute should be 0 when line's speed is 0")
    public void workingItemsPerMinuteForSpeedZero() {
        assertThat(carsAssemble.workingItemsPerMinute(0)).isEqualTo(0);
        logger.info("Working items per minute for speed 0: " + carsAssemble.workingItemsPerMinute(0));
    }

    @Test
    @Tag("Task:1")
    @DisplayName("The workingItemsPerMinute should be 3 when line's speed is 1")
    public void workingItemsPerMinuteForSpeedOne() {
        assertThat(carsAssemble.workingItemsPerMinute(1)).isEqualTo(3);
        logger.info("Working items per minute for speed 1: " + carsAssemble.workingItemsPerMinute(0));
    }


    @Test
    @Tag("Task:1")
    @DisplayName("The workingItemsPerMinute should be 16 when line's speed is 5")
    public void workingItemsPerMinuteForSpeedFive() {
        assertThat(carsAssemble.workingItemsPerMinute(5)).isEqualTo(16);
        logger.info("Working items per minute for speed 5: " + carsAssemble.workingItemsPerMinute(5));

    }

    @Test
    @Tag("Task:1")
    @DisplayName("The workingItemsPerMinute should be 26 when line's speed is 9")
    public void workingItemsPerMinuteForSpeedNine() {
        assertThat(carsAssemble.workingItemsPerMinute(9)).isEqualTo(26);
        logger.info("Working items per minute for speed 9: " + carsAssemble.workingItemsPerMinute(9));

    }

    @Test
    @Tag("Task:1")
    @DisplayName("The workingItemsPerMinute should be 28 when line's speed is 10")
    public void workingItemsPerMinuteForSpeedTen() {
        assertThat(carsAssemble.workingItemsPerMinute(10)).isEqualTo(28);
        logger.info("Working items per minute for speed 10: " + carsAssemble.workingItemsPerMinute(10));
    }


}