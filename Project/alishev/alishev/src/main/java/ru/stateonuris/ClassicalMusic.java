package ru.stateonuris;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    public String getSong() {
        return "Classical music";
    }

    public void doMyInit() {
        System.out.println("Do my init");
    }

    public void doMyDestroy() {
        System.out.println("Doing destroy!");
    }
}
