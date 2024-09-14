package HomeWork1.CourseAggregation;

import java.util.ArrayList;
import java.util.Objects;

class Instructor {
    private String firstName;
    private String lastName;
    private int officeNumber;

    public Instructor(String firstName, String lastName, int officeNumber) {
        this.firstName = validateNonEmptyString(firstName, "first name");
        this.lastName = validateNonEmptyString(lastName, "last name");
        this.officeNumber = validatePositiveInteger(officeNumber, "office num");
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = validateNonEmptyString(firstName, "first name");
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = validateNonEmptyString(lastName, "last name");
    }

    public int getOfficeNumber() {
        return this.officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = validatePositiveInteger(officeNumber, "office num");
    }

    private static String validateNonEmptyString(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " is null or empty");
        }
        return value;
    }

    private static int validatePositiveInteger(int value, String fieldName) {
        if (value <= 0) {
            throw new IllegalArgumentException(fieldName + " must be > 0");
        }
        return value;
    }

    public void printInfo() {
        System.out.printf("Name: %s %s\n",
                this.firstName,
                this.lastName);
    }
}

// Can be used record instead starting from Java14
class TextBook {
    private String title;
    private String author;
    private String publisher;

    public TextBook(String title, String author, String publisher) {
        this.title = validateNonEmptyString(title, "title");
        this.author = validateNonEmptyString(author, "author");
        this.publisher = validateNonEmptyString(publisher, "publisher");
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = validateNonEmptyString(title, "title");
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = validateNonEmptyString(author, "author");
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = validateNonEmptyString(publisher, "publisher");
    }

    private static String validateNonEmptyString(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " is null or empty");
        }
        return value;
    }

    public void printInfo() {
        System.out.printf("Title: %s, Author: %s\n",
                this.title,
                this.author);
    }
}

public class Course {
    private String name;
    private final ArrayList<Instructor> instructors;
    private final ArrayList<TextBook> textBooks;

    public Course(String courseName, Instructor instructor, TextBook textBook) {
        this.name = validateNonEmptyString(courseName, "courseName");
        this.instructors = new ArrayList<>();
        this.textBooks = new ArrayList<>();
        this.instructors.add(instructor);
        this.textBooks.add(textBook);
    }

    public void setName(String name) {
        this.name = validateNonEmptyString(name, "courseName");
    }

    public String getName() {
        return this.name;
    }

    public void addInstructor(Instructor instructor) {
        this.instructors.add(Objects.requireNonNull(instructor,
                "Instructor in null"));
    }

    public void addBook(TextBook book) {
        this.textBooks.add(Objects.requireNonNull(book, "Book is null"));
    }

    public void printCourseInfo() {
        System.out.printf("Course: %s\n", this.name);
        System.out.println("Instructors:");
        printAllInstructors();
        System.out.println("TextBooks:");
        printAllBooks();
    }

    public void printAllInstructors() {
        for (Instructor instructor : instructors) {
            instructor.printInfo();
        }
    }

    public void printAllBooks() {
        for (TextBook book : textBooks) {
            book.printInfo();
        }
    }

    private static String validateNonEmptyString(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " is null or empty");
        }
        return value;
    }
}
