package practice10;

public class Klass {
    private int number;
    //todo where is isIn() method?
    private Student student;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if (!student.isInClass()) {
            System.out.print("It is not one of us.\n");
            return;
        }
        student.setLeader(true);
        this.student = student;
    }

    public Student getLeader() {
        return student;
    }

    public void appendMember(Student student) {
        student.setInClass(true);
    }

    public boolean isStudentInKlass(Student student) {
        return student.getKlass().number == number;
    }
}
