package ru.emelianov.springedu.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class JazzMusic implements Music {

    @Override
    public String getSong() {
        return "Jazz Music";
    }

    @PostConstruct
    private void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    private void doMyDestroy() {
        System.out.println("Doing my destroying");
    }
}
