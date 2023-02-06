package com.yuryeu.git.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Basket {
    private List<Ball> balls = new ArrayList<>();

    public void addBall(Ball ball) {
        if (ball.isInUse()) {
            ball.setInUse(true);
            balls.add(ball);
        }
    }
}
