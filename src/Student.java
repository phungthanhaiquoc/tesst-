public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    public Student(Student s) {
        this.setName(s.name);
        this.setId(s.id);
        this.setEmail(s.email);
        this.setGroup(s.group);
    }

}
