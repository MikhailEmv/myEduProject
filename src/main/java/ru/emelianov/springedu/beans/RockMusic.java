package ru.emelianov.springedu.beans;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Rock Music";
    }
}
