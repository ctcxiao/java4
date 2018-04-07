package practice07;

public class Student extends Person {
    private int age;
    private String name;
    private Klass klass;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Student(String name, int age, Klass klass) {
        this.age = age;
        this.name = name;
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class 2.";
    }


    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    public Klass getKlass() {
        return klass;
    }
}
