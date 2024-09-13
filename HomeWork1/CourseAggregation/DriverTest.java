package HomeWork1.CourseAggregation;

public class DriverTest {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("John", "Doe", 101);
        Instructor instructor2 = new Instructor("Jane", "Smith", 102);

        TextBook book1 = new TextBook("Introduction to Java", "James Gosling", "Sun Microsystems");
        TextBook book2 = new TextBook("Advanced Java Programming", "Herbert Schildt", "McGraw-Hill");

        Course javaCourse = new Course("Java Programming", instructor1, book1);
        javaCourse.addInstructor(instructor2);
        javaCourse.addBook(book2);

        javaCourse.printCourseInfo();
    }
}
