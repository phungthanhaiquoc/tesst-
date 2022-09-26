public class StudentManagement {
    Student[] students = new Student[100];
    int index = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent) {
        this.students[this.index] = new Student(newStudent);
        this.index++;
    }

    public String studentsByGroup() {
        String ans = "";
        int[] mark = new int[this.index];
        for (int i = 0; i < this.index; i++) {
            if (mark[i] == 0) {
                mark[i] = 1;
                ans = ans + this.students[i].getGroup() + "\n";
                ans = ans + this.students[i].getInfo() + "\n";
                for (int j = i + 1; j < this.index; j++) {
                    if (this.sameGroup(this.students[i], this.students[j])) {
                        mark[j] = 1;
                        ans = ans + this.students[j].getInfo() + "\n";
                    }
                }
            }
        }
        return ans;
    }

    public void removeStudent(String id) {
        for (int i = 0; i < this.index; i++) {
            if (this.students[i].getId().equals(id)) {
                for (int j = i; j < this.index; j++) {
                    this.students[j] = this.students[j + 1];
                }
                this.index--;
                break;
            }
        }
    }

}
