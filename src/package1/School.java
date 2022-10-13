package package1;
import java.util.List;
import java.lang.String;
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

    public School (int stufees){
        totalMoneyEarned=stufees;
    }
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned  ;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent)
    {
        totalMoneyEarned-=moneySpent;
    }
}