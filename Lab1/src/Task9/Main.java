package Task9;

import Task9.Entities.Ball;
import Task9.Entities.Basket;
import Task9.Enums.Color;

public class Main {
    public static void main(String[] args) {

        var basket = new Basket();
        basket.addBall(new Ball(Color.BLUE, 2));
        basket.addBall(new Ball(Color.BLUE, 1));
        basket.addBall(new Ball(Color.RED, 2));
        basket.addBall(new Ball(Color.RED, 3));
        basket.addBall(new Ball(Color.BLUE, 2));
        basket.addBall(new Ball(Color.RED, 1));

        System.out.println("Weight of basket is: " + basket.getWeight());
        System.out.println("Amount of blue balls: " + basket.getBlueBallsCount());
    }
}
