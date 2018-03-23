// I worked on this project alone with the help of the Java API

/**
 * The Class Instructor represents an instance of an instructor.
 *
 * @author Abhishek Mallemadugula
 * @version 1
 */
public class Instructor extends User implements Alumnus {

    /** The years teaching. */
    private int     yearsTeaching;

    /** The has tenure. */
    private boolean hasTenure;

    /** The alma mater. */
    private String  almaMater;

    /** The grad year. */
    private int     gradYear;

    /**
     * Instantiates an object of type Instructor.
     *
     * @param name
     *            the name
     * @param yearsTeaching
     *            the years teaching
     * @param hasTenure
     *            the has tenure
     * @param almaMater
     *            the alma mater
     * @param gradYear
     *            the grad year
     */
    public Instructor(String name, int yearsTeaching, boolean hasTenure,
            String almaMater, int gradYear) {
        super(name);
        this.yearsTeaching = yearsTeaching;
        this.hasTenure = hasTenure;
        this.almaMater = almaMater;
        this.gradYear = gradYear;
    }

    @Override
    public int compareTo(User other) {
        if (!(other instanceof Instructor)) {
            return this.getClass().getName()
                    .compareTo(other.getClass().getName());
        } else {
            Instructor a = (Instructor) other;
            if (this.hasTenure && !a.hasTenure) {
                return 1;
            } else if (!this.hasTenure && a.hasTenure) {
                return -1;
            } else {
                if (this.yearsTeaching > a.yearsTeaching) {
                    return 1;
                } else if (this.yearsTeaching < a.yearsTeaching) {
                    return -1;
                } else {
                    return super.compareTo(a);
                }
            }
        }
    }

    /**
     * Gets the years teaching.
     *
     * @return the years teaching
     */
    public int getYearsTeaching() {
        return yearsTeaching;
    }

    /**
     * Sets the years teaching.
     *
     * @param yearsTeaching
     *            the new years teaching
     */
    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    /**
     * Checks if is checks for tenure.
     *
     * @return true, if is checks for tenure
     */
    public boolean isHasTenure() {
        return hasTenure;
    }

    /**
     * Sets the checks for tenure.
     *
     * @param hasTenure
     *            the new checks for tenure
     */
    public void setHasTenure(boolean hasTenure) {
        this.hasTenure = hasTenure;
    }

    /**
     * Sets the alma mater.
     *
     * @param almaMater
     *            the new alma mater
     */
    public void setAlmaMater(String almaMater) {
        this.almaMater = almaMater;
    }

    /**
     * Sets the grad year.
     *
     * @param gradYear
     *            the new grad year
     */
    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    /**
     * Gets the Alma Mater
     *
     * @return the almaMater
     */
    @Override
    public String getAlmaMater() {
        return this.almaMater;
    }

    /**
     * Gets the Grad Year
     *
     * @return the grad year
     */
    @Override
    public int getGradYear() {
        return this.gradYear;
    }

}
