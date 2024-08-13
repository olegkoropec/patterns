package adapter;

public class StudentAdapter {

    public User map(Student student) {
        User user = new User();

        user.setId(Long.valueOf(student.getId()));
        user.setName(student.getStudentFirstName() + " " + student.getStudentLastName());

        return user;
    }

}
