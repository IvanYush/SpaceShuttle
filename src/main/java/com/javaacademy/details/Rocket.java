package com.javaacademy.details;

import com.javaacademy.exceptions.LimitFuelException;
import lombok.ToString;

/**
 * Ракета носитель
 */
@ToString
public class Rocket {
    //Двигатель первой стадии
    private Engine firstStage;
    //Двигатель второй стадии
    private Engine secondStage;
    //Двигатель третьей стадии
    private Engine thirdStage;

    public Rocket(Engine firstStage, Engine secondStage, Engine thirdStage) {
        this.firstStage = firstStage;
        this.secondStage = secondStage;
        this.thirdStage = thirdStage;
    }

    /**
     * Запуск ракеты носителя
     */
    public void run() {
        try {
            firstStage.start();
            secondStage.start();
            thirdStage.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Engine getFirstStage() {
        return firstStage;
    }

    public Engine getSecondStage() {
        return secondStage;
    }

    public Engine getThirdStage() {
        return thirdStage;
    }
}
