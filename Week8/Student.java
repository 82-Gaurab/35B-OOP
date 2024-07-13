package Week8;

public class Student {

    // 3. You are working on a student information system and need to create a
    // Student class. The student class should have private instance variables for
    // the student's name, ID number, and grade point average (GPA). Implement
    // getter and setter methods for the name and ID number, ensuring that they can
    // be accessed and modified only through these methods. However, the GPA should
    // be read-only and can only be set within the class constructor.

    private String name;
    private int ID;
    private float GPA;

    public float getGPA() {
        return GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    Student(String name, int ID, float GPA) {
        this.name = name;
        this.ID = ID;
        this.GPA = GPA;
    }
}
