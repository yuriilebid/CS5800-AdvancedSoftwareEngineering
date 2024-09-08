package Course_Aggregation;

import java.util.ArrayList;

class Instructor {
    private final String firstName;
    private final String lastName;
    private int officeNumber;

    public Instructor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = 0; // Default value
    }

    public Instructor(String firstName, String lastName, int officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getOfficeNumber() {
        return this.officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }
}

// Can be used record instead starting from Java14
class TextBook {
    private final String title;
    private final String author;
    private final String publisher;

    public TextBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPublisher() {
        return this.publisher;
    }
}

public class Course {
    private String name;
    private final ArrayList<Instructor> instructors;
    private final ArrayList<TextBook> textBooks;

    public Course(String courseName, Instructor instructor, TextBook textBook) {
        if(instructor == null || textBook == null) {
            throw new IllegalArgumentException("Instructor and TextBook cannot be null");
        }
        this.name = courseName;
        this.instructors = new ArrayList<>();
        this.textBooks = new ArrayList<>();
        this.instructors.add(instructor);
        this.textBooks.add(textBook);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addInstructor(Instructor instructor) {
        this.instructors.add(instructor);
    }

    public void addBook(TextBook book) {
        this.textBooks.add(book);
    }

    public void printCourseInfo() {
        System.out.printf("Course: %s\n", this.name);
        System.out.println("Instructors:");
        for (Instructor instructor : instructors) {
            System.out.printf("  Name: %s %s, Office Number: %d\n",
                    instructor.getFirstName(),
                    instructor.getLastName(),
                    instructor.getOfficeNumber());
        }
        System.out.println("TextBooks:");
        for (TextBook book : textBooks) {
            System.out.printf("  Title: %s, Author: %s, Publisher: %s\n",
                    book.getTitle(),
                    book.getAuthor(),
                    book.getPublisher());
        }
    }
}
