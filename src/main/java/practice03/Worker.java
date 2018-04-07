package practice03;

public class Worker {
    private int age;
    private String name;

    public Worker(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Worker() {
    }

    public String introduce(){
        return "I am a Worker. I have a job.";
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
