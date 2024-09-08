package Course_Aggregation;

public class DriverTest {
    public static void main(String[] args) {
        // Creating Instructor objects
        Instructor instructor1 = new Instructor("John", "Doe", 101);
        Instructor instructor2 = new Instructor("Jane", "Smith", 102);

        // Creating TextBook objects
        TextBook book1 = new TextBook("Introduction to Java", "James Gosling", "Sun Microsystems");
        TextBook book2 = new TextBook("Advanced Java Programming", "Herbert Schildt", "McGraw-Hill");

        // Creating a Course object and adding instructors and books
        Course javaCourse = new Course("Java Programming", instructor1, book1);
        javaCourse.addInstructor(instructor2); // Adding another instructor
        javaCourse.addBook(book2); // Adding another book

        // Printing course information
        javaCourse.printCourseInfo();
    }
}
