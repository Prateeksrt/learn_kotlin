import java.util.List;

public class ClassRoom {
    List<Student> students;
    List<Teacher> teacher;

    public ClassRoom(List<Student> students, List<Teacher> teacher) {
        this.students = students;
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassRoom classRoom = (ClassRoom) o;

        if (students != null ? !students.equals(classRoom.students) : classRoom.students != null) return false;
        return teacher != null ? teacher.equals(classRoom.teacher) : classRoom.teacher == null;
    }

    @Override
    public int hashCode() {
        int result = students != null ? students.hashCode() : 0;
        result = 31 * result + (teacher != null ? teacher.hashCode() : 0);
        return result;
    }
}
