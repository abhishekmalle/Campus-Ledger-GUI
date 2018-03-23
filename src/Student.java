// I worked on this project alone with the help of the Java API

/**
 * The Class Student represents an instance of an student.
 *
 * @author Abhishek Mallemadugula
 * @version 1
 */

public abstract class Student extends User {

    /** The credit hours. */
    private int     creditHours;

    /** The in state. */
    private boolean inState;

    /**
     * An abstract constructor for the class student.
     *
     * @param name
     *            the name
     * @param creditHours
     *            the credit hours
     * @param inState
     *            the in state
     */
    public Student(String name, int creditHours, boolean inState) {
        super(name);
        this.creditHours = creditHours;
        this.inState = inState;
    }

    @Override
    public int compareTo(User other) {
        if (!(other instanceof Student)) {
            return this.getClass().getName()
                    .compareTo(other.getClass().getName());
        } else {
            Student a = (Student) other;
            if (this.creditHours < a.creditHours) {
                return 1;
            } else if (this.creditHours > a.creditHours) {
                return -1;
            } else {
                if (this.inState && !a.inState) {
                    return 1;
                } else if (!this.inState && a.inState) {
                    return -1;
                } else {
                    return super.compareTo(a);
                }
            }
        }
    }

    /**
     * Gets the credit hours.
     *
     * @return the credit hours
     */
    public int getCreditHours() {
        return creditHours;
    }

    /**
     * Sets the credit hours.
     *
     * @param creditHours
     *            the new credit hours
     */
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    /**
     * Checks if is in state.
     *
     * @return true, if is in state
     */
    public boolean isInState() {
        return inState;
    }

    /**
     * Sets the in state.
     *
     * @param inState
     *            the new in state
     */
    public void setInState(boolean inState) {
        this.inState = inState;
    }

}
