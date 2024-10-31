package com.javaacademy.details;

import com.javaacademy.exceptions.LimitFuelException;
import com.javaacademy.exceptions.NotEnoughFuelException;
import lombok.ToString;

/**
 * Двигатель космического корабля
 */
@ToString
public class Engine {
    //Минимальное количество топливо для старта
    private static final double MINIMUM_FUEL_FOR_START = 60_000;
    //Максимальное количество топлива внутри двигателя
    private static final double MAX_FUEL = 100_000;
    //Текущее количество топлива в двигателе
    private double currentFuel;

    public Engine(double currentFuel) throws LimitFuelException {
        this.currentFuel = currentFuel;
        if (currentFuel > MAX_FUEL) {
            throw new LimitFuelException("Количество топлива при создании двигателя больше лимита");
        }
    }

    /**
     * Запуск двигателя
     */
    public void start() throws NotEnoughFuelException {
        if (currentFuel < MINIMUM_FUEL_FOR_START) {
            throw new NotEnoughFuelException("Количество топлива недостаточно для старта двигателя");
        }
        currentFuel = 0;
    }

    /**
     * Дозаправка
     */
    public void refuel(double currentFuel) throws LimitFuelException {
        if ((this.currentFuel + currentFuel) > MAX_FUEL) {
            throw new LimitFuelException("Количество топлива после дозаправки двигателя больше лимита");
        }
        this.currentFuel += currentFuel;
    }
}
