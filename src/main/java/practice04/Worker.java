package practice04;

public class Worker extends Person{
    private int age;
    private String name;

    public Worker(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Worker() {
    }

    @Override
    public String introduce(){
        return super.introduce()+" I am a Worker. I have a job.";
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
