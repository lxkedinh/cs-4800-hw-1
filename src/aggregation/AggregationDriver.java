package aggregation;

public class AggregationDriver {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructorTwo = new Instructor("Thomas", "Huang", "3-2628");
        Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", "Pearson");
        Textbook textbookTwo = new Textbook("Basics of Software Engineering", "Robert C. Martin", "McGraw-Hill");
        Course course = new Course("Software Engineering", instructor, instructorTwo, textbook, textbookTwo);
        course.print();
    }
}
