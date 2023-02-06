package com.yuryeu.git.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
public class Ball {
    private final String color;
    private final int weight;
    @ToString.Exclude
    private boolean inUse;
}
