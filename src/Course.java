// I worked on this project alone with the help of the Java API

/**
 * The Class Course represents an instance of a course.
 *
 * @author Abhishek Mallemadugula
 * @version 1
 */
public class Course implements Comparable<Course> {

    /** The name. */
    private String     name;

    /** The course code. */
    private int        courseCode;

    /** The instructor. */
    private Instructor instructor;

    /** The students. */
    private Student[]  students;

    /**
     * Creates a course.
     *
     * @param name
     *            the name
     * @param courseCode
     *            the course code
     * @param instructor
     *            the instructor
     * @param students
     *            the students
     */
    public Course(String name, int courseCode, Instructor instructor,
            Student[] students) {
        this.name = name;
        this.courseCode = courseCode;
        this.instructor = instructor;
        this.students = students;
    }

    @Override
    public int compareTo(Course other) {
        if (this.courseCode > other.courseCode) {
            return 1;
        } else if (this.courseCode < other.courseCode) {
            return -1;
        } else {
            return this.instructor.getName()
                    .compareTo(other.instructor.getName());
        }
    }

    /**
     * Gets the instructor name.
     *
     * @return the instructor name
     */
    public String getInstructorName() {
        return this.instructor.getName();
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the course code.
     *
     * @return the course code
     */
    public int getCourseCode() {
        return courseCode;
    }

    /**
     * Sets the course code.
     *
     * @param courseCode
     *            the new course code
     */
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * Gets the instructor.
     *
     * @return the instructor
     */
    public Instructor getInstructor() {
        return instructor;
    }

    /**
     * Sets the instructor.
     *
     * @param instructor
     *            the new instructor
     */
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    /**
     * Gets the students.
     *
     * @return the students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * Sets the students.
     *
     * @param students
     *            the new students
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

}
