package practice10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Teacher extends Person {
    private int age;
    private String name;
    private HashSet<Klass> klasses;
    private int id;
    public Teacher(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Teacher(int id, String name, int age, HashSet<Klass> klasses) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.klasses = klasses;
    }

    @Override
    public String introduce() {
        if (klasses == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            final StringBuilder introduce = new StringBuilder(super.introduce() + " I am a Teacher. I teach Class ");

            List<Integer> list = new ArrayList<>();
            for (Klass klass : klasses) {
                introduce.append(klass.getNumber()).append(", ");
            }
//            list.stream().sorted().forEach(e -> introduce.append(e).append(", "));
            StringBuilder result = introduce.delete(introduce.toString().length() - 2, introduce.toString().length());

            return result.append(".").toString();
        }
    }

    public boolean isTeaching(Student student){
        for (Klass klass: klasses) {
            if (klass.isStudentInKlass(student)){
                return true;
            }
        }
        return false;
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

    public HashSet<Klass> getClasses() {
        return klasses;
    }

    public String introduceWith(Student jerry) {
        for (Klass klass: klasses) {
            if (jerry.getKlass().getNumber() == klass.getNumber()){
                return jerry.baseIntroduce()+" I am a Teacher. I teach Jerry.";
            }
        }
        return jerry.baseIntroduce()+" I am a Teacher. I don't teach Jerry.";
    }
}
