package practice01;

import java.util.stream.Stream;

public class Person {
    private int age;
    private String name;

    public String introduce(){
        return "My name is Tom. I am 21 years old.";
    }
    
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
