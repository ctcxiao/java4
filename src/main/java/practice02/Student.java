package practice02;

public class Student extends Person{
    private int age;
    private String name;
    private int klass;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Student(String name, int age, int klass){
        this.age = age;
        this.name = name;
        this.klass = klass;
    }
    @Override
    public String introduce() {
        return "I am a Student. I am at Class "+klass+".";
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getKlass() {
        return klass;
    }
}
