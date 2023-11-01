package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;


public class Car {
    private String name;
    private int distance;

    public Car(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    public void updateDistance(int randomNum) {
        if (randomNum >= 5) {
            this.distance++;
        }
    }
}
