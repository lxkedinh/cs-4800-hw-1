package aggregation;

public class Course {
    private String name;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String name, Instructor instructor, Textbook textbook) {
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void print() {
        System.out.println("Course name: " + name + "\n" +
                "Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() + "\n" +
                "Textbook: \"" + textbook.getTitle() + "\" by " + textbook.getAuthor());
    }
}
