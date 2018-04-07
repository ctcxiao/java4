package practice10;

public class Person {
    private int age;
    private String name;
    private int id;
    public Person(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        return id == ((Person)obj).id;
    }

    public String baseIntroduce(){
        return "My name is Tom. I am 21 years old.";
    }

    public String introduce(){
        return "My name is Tom. I am 21 years old.";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
