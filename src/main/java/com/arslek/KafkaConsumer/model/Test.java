package com.arslek.KafkaConsumer.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class Test {

    private String name;

    private int age;

    public Test() {}

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
