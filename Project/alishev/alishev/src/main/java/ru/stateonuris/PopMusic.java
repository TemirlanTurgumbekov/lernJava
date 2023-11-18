package ru.stateonuris;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {
    public String getSong() {
        return "PopMusic";
    }
}
