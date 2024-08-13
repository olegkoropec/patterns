package adapter;

import java.util.List;

public class Student {

    private String id;
    private String studentFirstName;
    private String studentLastName;
    private String username;
    private List<String> accesses;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getAccesses() {
        return accesses;
    }

    public void setAccesses(List<String> accesses) {
        this.accesses = accesses;
    }
}
