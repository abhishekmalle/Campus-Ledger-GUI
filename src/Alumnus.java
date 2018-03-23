// I worked on this project alone with the help of the Java API

/**
 * The Interface Alumnus requires classes that implement it to be Users who have
 * already acquired a degree.
 *
 * @author Abhishek Mallemadugula
 * @version 1
 */
public interface Alumnus {

    /**
     * Gets the alma mater.
     *
     * @return the alma mater
     */
    String getAlmaMater();

    /**
     * Gets the grad year.
     *
     * @return the grad year
     */
    int getGradYear();

    /**
     * Gets the name.
     *
     * @return the name
     */
    String getName();

    /**
     * Gets the type.
     *
     * @return the type
     */
    String getType();
}
