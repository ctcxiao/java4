package practice10;

public class Student extends Person {
    private int age;
    private String name;
    private Klass klass;
    private boolean isLeader;
    private int id;
    private boolean isInClass;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Student(int id, String name, int age, Klass klass) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (isLeader){
            return super.introduce() + " I am a Student. I am Leader of Class 2.";
        }
        return super.introduce() + " I am a Student. I am at Class 2.";
    }

    public boolean isInClass() {
        return isInClass;
    }

    public void setInClass(boolean inClass) {
        isInClass = inClass;
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

    public boolean isLeader() {
        return isLeader;
    }

    public void setLeader(boolean leader) {
        isLeader = leader;
    }
}
