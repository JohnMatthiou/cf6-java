package gr.aueb.cf.ch20.lambdas;

public class Teacher {
    private int teacherID;
    private String firstname;
    private String lastname;

    public Teacher() {

    }

    public Teacher(int teacherID, String firstname, String lastname) {
        this.teacherID = teacherID;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public void printInstanceTeacher() {
        System.out.println("ID: " + teacherID + ", Firstname: " + firstname + ", Lastname: " + lastname);
    }

    public static void printStaticTeacher(Teacher teacher) {
        System.out.println("ID: " + teacher.getTeacherID() + ", Firstname: " + teacher.getFirstname() + ", Lastname: " + teacher.getLastname());
    }
}
