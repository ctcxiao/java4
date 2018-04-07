package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass{
    private int number;
    private Student student;
    private List<Teacher> teacherList = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
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
        for (Teacher teacher: teacherList) {
            teacher.observeLeader(student);
        }
        student.setLeader(true);
        this.student = student;
    }

    public Student getLeader() {
        return student;
    }

    public void appendMember(Student student) {
        for (Teacher teacher: teacherList) {
            teacher.observeJoin(student);
        }
        student.setInClass(true);
    }

    public boolean isStudentInKlass(Student student) {
        return student.getKlass().number == number;
    }


}
