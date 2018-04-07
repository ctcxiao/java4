package practice06;

public class Teacher extends Person{
    private int age;
    private String name;
    private int klass;

    public Teacher(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Teacher(String name, int age, int klass) {
        this.age = age;
        this.name = name;
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (klass == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " I am a Teacher. I teach Class "+klass+".";
        }
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
