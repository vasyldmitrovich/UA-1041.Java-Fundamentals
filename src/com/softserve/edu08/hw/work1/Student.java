public class Student extends Person implements Cloneable {
    private int course;

    public Student(int age, FullName fullName, int course) {
        super(age, fullName);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course number: " + course;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student clonedStudent = (Student) super.clone();
        clonedStudent.course = this.course;
        return clonedStudent;
    }

    @Override
    public String activity() {
        return "I study at university";
    }
}
