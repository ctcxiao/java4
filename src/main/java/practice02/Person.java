package practice02;

public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public String introduce(){
        return "My name is "+name+". I am "+age+" years old.";
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
