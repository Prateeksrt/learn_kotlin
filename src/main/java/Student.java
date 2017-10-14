import java.util.Map;

public class Student {
    private String name;
    private Integer rollNumber;
    private Map<Subject, Integer> marks;

    public Student(String name, Integer rollNumber, Map<Subject, Integer> marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Map<Subject, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<Subject, Integer> marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!name.equals(student.name)) return false;
        return rollNumber.equals(student.rollNumber) && marks.equals(student.marks);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + rollNumber.hashCode();
        result = 31 * result + marks.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", marks=" + marks +
                '}';
    }
}
