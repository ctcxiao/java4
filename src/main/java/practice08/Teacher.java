package practice08;

public class Teacher extends Person {
    private int age;
    private String name;
    private Klass klass;
    private int id;
    public Teacher(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " I am a Teacher. I teach Class "+klass.getNumber()+".";
        }
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
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

    public String introduceWith(Student jerry) {
        if (jerry.getKlass().getNumber() == klass.getNumber()){
            return jerry.baseIntroduce()+" I am a Teacher. I teach Jerry.";
        }
        return jerry.baseIntroduce()+" I am a Teacher. I don't teach Jerry.";
    }
}
