import practice08.Person;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Tom", 21);
        Person person2 = new Person(1, "Tom", 21);

        System.out.println(person1.equals(person2));
    }
}
