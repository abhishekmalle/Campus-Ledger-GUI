// I worked on this project alone with the help of the Java API

/**
 * The Class Undergrad represents an instance of an undergraduate student.
 *
 * @author Abhishek Mallemadugula
 * @version 1
 */
public class Undergrad extends Student {

    /** The year. */
    private Year year;

    /**
     * Initializes an undergraduate student.
     *
     * @param name
     *            the name
     * @param creditHours
     *            the credit hours
     * @param inState
     *            the in state
     * @param year
     *            the year
     */
    public Undergrad(String name, int creditHours, boolean inState, Year year) {
        super(name, creditHours, inState);
        this.year = year;
    }

    @Override
    public int compareTo(User other) {
        if (other instanceof Undergrad) {
            Undergrad a = (Undergrad) other;
            if (this.year.ordinal() < a.year.ordinal()) {
                return 1;
            } else if (this.year.ordinal() > a.year.ordinal()) {
                return -1;
            } else {
                return super.compareTo(a);
            }
        } else {
            return this.getClass().getName()
                    .compareTo(other.getClass().getName());
        }
    }

    /**
     * Gets the year.
     *
     * @return the year
     */
    public Year getYear() {
        return year;
    }

    /**
     * Sets the year.
     *
     * @param year
     *            the new year
     */
    public void setYear(Year year) {
        this.year = year;
    }

}
