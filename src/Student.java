public class Student {
    
    private String name;
    private String classroom;
    private String course;
    private int id;

    public Student(String name, String classroom, String course, int id) {
        this.name = name;
        this.classroom = classroom;
        this.course = course;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getClassroom() {
        return classroom;
    }

    public String getCourse() {
        return course;
    }

    public int getId() {
        return id;
    }
}
