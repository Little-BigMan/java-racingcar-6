package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void updateDistance() {
        String name = "wtc";
        Car car = new Car(name);
        int randomNum = Randoms.pickNumberInRange(0, 9);
        car.updateDistance(randomNum);
        System.out.println("randomNum = " + randomNum);
        System.out.println("randomNum = " + car.getDistance());
        if (randomNum > 5) {
            Assertions.assertThat(car.getDistance()).isEqualTo(1);
        } else {
            Assertions.assertThat(car.getDistance()).isEqualTo(0);
        }

    }
}