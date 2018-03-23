// I worked on this project alone with the help of the Java API

/**
 * The Class User represents an instance of an user.
 *
 * @author Abhishek Mallemadugula
 * @version 1
 */
public abstract class User implements Comparable<User> {

    /** The name. */
    private String     name;

    /** The id. */
    private int        id;

    /** The count. */
    private static int count = 0;

    /**
     * This abstract constructor for the class User.
     *
     * @param name
     *            the name
     */
    public User(String name) {
        this.setName(name);
        this.id = ++count;

    }

    /**
     * Returns the name of the class.
     *
     * @return name of the class
     */
    public String getType() {
        return this.getClass().getName();
    }

    @Override
    public int compareTo(User other) {
        if (this.id < other.id) {
            return -1;
        } else if (this.id == other.id) {
            return 0;
        } else {
            return 1;
        }
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
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id
     *            the new id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the count.
     *
     * @return the count
     */
    public static int getCount() {
        return count;
    }

}