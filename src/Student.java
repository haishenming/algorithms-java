import java.util.Objects;

// test generic
public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName().toLowerCase(), student.getName().toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().toLowerCase());
    }

    public Student(String name) {
        this.name = name;
    }
}
