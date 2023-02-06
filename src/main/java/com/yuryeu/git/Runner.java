package com.yuryeu.git;

import com.yuryeu.git.model.Ball;
import com.yuryeu.git.model.Basket;
import com.yuryeu.git.model.Basketballer;

public class Runner {
    public static void main(String[] args) {
        Ball redBall = new Ball("Red", 500);
        Ball blueBall = new Ball("Blue", 650);

        Basket basket1 = new Basket();
        Basket basket2 = new Basket();

        Basketballer lebronJames = new Basketballer("LeBron", "James", 198, 121);

        lebronJames.attemptToDunk(basket1, redBall);
        lebronJames.attemptToScoreAThreePointBall(basket2, blueBall);
    }
}
