package aggregation;

public class Course {
    private String name;
    private Instructor instructorOne;
    private Instructor instructorTwo;
    private Textbook textbookOne;
    private Textbook textbookTwo;

    public Course(String name, Instructor instructorOne, Instructor instructorTwo, Textbook textbookOne, Textbook textbookTwo) {
        this.name = name;
        this.instructorOne = instructorOne;
        this.instructorTwo = instructorTwo;
        this.textbookOne = textbookOne;
        this.textbookTwo = textbookTwo;
    }

    public void print() {
        System.out.println("Course name: " + name + "\n" +
                "Instructor One: " + instructorOne.getFirstName() + " " + instructorOne.getLastName() + "\n" +
                "Instructor Two: " + instructorTwo.getFirstName() + " " + instructorTwo.getLastName() + "\n" +
                "Textbook One: \"" + textbookOne.getTitle() + "\" by " + textbookOne.getAuthor() + "\n" +
                "Textbook Two: \"" + textbookTwo.getTitle() + "\" by " + textbookTwo.getAuthor());
    }
}
