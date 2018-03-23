// I worked on this project alone with the help of the Java API

/**
 * The Class Grad represents an instance of an Graduated student.
 *
 * @author Abhishek Mallemadugula
 * @version 1
 */
public class Grad extends Student implements Alumnus {

    /** The alma mater. */
    private String almaMater;

    /** The grad year. */
    private int    gradYear;

    /**
     * This method creates an instance of a graduate student.
     *
     * @param name
     *            the name
     * @param creditHours
     *            the credit hours
     * @param inState
     *            the in state
     * @param almaMater
     *            the alma mater
     * @param gradYear
     *            the grad year
     */
    public Grad(String name, int creditHours, boolean inState, String almaMater,
            int gradYear) {
        super(name, creditHours, inState);
        this.almaMater = almaMater;
        this.gradYear = gradYear;
    }

    @Override
    public int compareTo(User other) {
        if (!(other instanceof Grad)) {
            return this.getClass().getName()
                    .compareTo(other.getClass().getName());
        } else {
            Grad a = (Grad) other;
            if (this.gradYear < a.gradYear) {
                return 1;
            } else if (this.gradYear > a.gradYear) {
                return -1;
            } else {
                return super.compareTo(a);
            }
        }
    }

    /**
     * Gets the Alma Mater
     *
     * @return the almaMater
     */
    @Override
    public String getAlmaMater() {
        return almaMater;
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
     * Gets the grad year
     *
     * @return the grad year
     */
    @Override
    public int getGradYear() {
        return gradYear;
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

}
