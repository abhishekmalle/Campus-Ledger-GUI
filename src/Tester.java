import java.util.*;

public class Tester {

    public static void main(String[] args) {
        ArrayList<Course> listC = new ArrayList<Course>();
        ArrayList<Instructor> listI = new ArrayList<Instructor>();
        ArrayList<Undergrad> listU = new ArrayList<Undergrad>();
        ArrayList<Grad> listG = new ArrayList<Grad>();
        ArrayList<Student> listS = new ArrayList<Student>();
        Student[] student = new Student[10];
        Instructor a = new Instructor("a", 10, true, "GT", 2017);
        Instructor b = new Instructor("b", 2, true, "GSU", 2013);
        Instructor c = new Instructor("c", 10, false, "UGA", 2015);
        Instructor d = new Instructor("d", 2, false, "GT", 2015);
        Instructor e = new Instructor("e", 7, true, "UGA", 2002);
        Instructor f = new Instructor("f", 10, false, "GT", 2017);
        listC.add(new Course("Intro to CS", 1301, d , student));
        listC.add(new Course("Objected Oriented Programming", 1331, e , student));
        listC.add(new Course("Intro to CS", 1301, b, student));
        listC.add(new Course("MatLab", 1371, c , student));
        listC.add(new Course("Objected Oriented Programming", 1331, f , student));
        listC.add(new Course("Intro to CS", 1301, a , student));
        listI.add(a);
        listI.add(b);
        listI.add(c);
        listI.add(d);
        listI.add(e);
        listI.add(f);
        Undergrad Ua = new Undergrad("Undergrad a", 25, false, Year.FRESHMAN);
        Undergrad Ub = new Undergrad("Undergrad b", 3, true, Year.SOPHOMORE);
        Undergrad Uc = new Undergrad("Undergrad c", 3, false, Year.SOPHOMORE);
        Undergrad Ud = new Undergrad("Undergrad d", 3 , false, Year.FRESHMAN);
        Undergrad Ue = new Undergrad("Undergrad e", 25, true, Year.FRESHMAN);
        Undergrad Uf = new Undergrad("Undergrad f", 25, false, Year.FRESHMAN);
        Undergrad Ug = new Undergrad("Undergrad g", 1, false, Year.SENIOR);
        Undergrad Uh = new Undergrad("Undergrad h", 1, true, Year.SENIOR);
        Undergrad Ui = new Undergrad("Undergrad i", 25, false, Year.SENIOR);
        listU.add(Ua);
        listU.add(Ub);
        listU.add(Uc);
        listU.add(Ud);
        listU.add(Ue);
        listU.add(Uf);
        listU.add(Ug);
        listU.add(Uh);
        listU.add(Ui);






        System.out.println("Before sorting:");
        for (Course course : listC) {
            System.out.println("Coourse name: " + course.getName() + ", "
                + "Course code: " + course.getCourseCode()
                + "," + "Instructor: " + course.getInstructorName());
        }
        System.out.println();
        for (Instructor instructor : listI) {
            System.out.println("Prof'sName: " + instructor.getName() + ", "
                + "ID: " + instructor.getId() + ", "
                + "YearTeachs: " + instructor.getYearsTeaching() + ", "
                + "Tenured: " + instructor.isHasTenure() + ", "
                + "AlaMater: " + instructor.getAlmaMater()+ ", "
                + "Graduate: " + instructor.getGradYear());
        }
        System.out.println();
        for (Undergrad under : listU) {
            System.out.println("UnderGrad'sName: " + under.getName() + ", "
                + "ID: " + under.getId() + ", "
                + "Credit: " + under.getCreditHours() + ", "
                + "InState: " + under.isInState() + ", "
                + "Year: " + under.getYear());
        }


        System.out.println();
        System.out.println("Sorting");
        System.out.println();
        Collections.sort(listC);
        Collections.sort(listI);
        Collections.sort(listU);
        System.out.println("After sorting:");
        for (Course course : listC) {
            System.out.println("Coourse name: " + course.getName() + ", "
                + "Course code: " + course.getCourseCode()
                + "," + "Instructor: " + course.getInstructorName());
        }
        System.out.println();
        for (Instructor instructor : listI) {
            System.out.println("Prof'sName: " + instructor.getName() + ", "
                + "ID: " + instructor.getId() + ", "
                + "YearTeachs: " + instructor.getYearsTeaching() + ", "
                + "Tenured: " + instructor.isHasTenure() + ", "
                + "AlaMater: " + instructor.getAlmaMater()+ ", "
                + "Graduate: " + instructor.getGradYear());
        }
        System.out.println();
        for (Undergrad under : listU) {
            System.out.println("Undergrad'sName: " + under.getName() + ", "
                + "ID: " + under.getId() + ", "
                + "Credit: " + under.getCreditHours() + ", "
                + "InState: " + under.isInState() + ", "
                + "Year: " + under.getYear());
        }
    }

}
