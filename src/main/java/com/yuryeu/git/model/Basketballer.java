package com.yuryeu.git.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Basketballer {
    private String name;
    private String surname;
    private int height;
    private int verticalJumpHeight;

    public void attemptToScoreAThreePointBall(Basket basket, Ball ball) {
        if (Math.random() < 0.35) {
            basket.addBall(ball);
            System.out.println("Nice three-pointer!");
        } else {
            System.out.println("Try it again :(");
        }
    }

    public void attemptToDunk(Basket basket, Ball ball) {
        if (height > 185 && verticalJumpHeight > 75 && Math.random() < 0.85) {
            basket.addBall(ball);
            System.out.println("BOOM!!!");
        } else {
            System.out.println("You are too short or unlucky :(");
        }
    }
}
