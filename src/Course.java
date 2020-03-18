/*
Scott Cromling
Lab7
 */
public class Course {
    static String name;
    static String semester;
    static Instructor instructor;
    static Textbook textbook;


    public Course() {
        this.name = null;
        this.semester = null;
        this.instructor = null;
        this.textbook = null;
    }

    public Course(String name, String semester, Instructor instructor, Textbook textbook) {
        this.name = name;
        this.semester = semester;
        this.instructor = instructor;
        this.textbook = textbook;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    @Override
    public String toString() {
        return name + "," + semester + System.lineSeparator() + instructor
                + System.lineSeparator() + textbook;
    }
}
