
public class StudentManagement {
    Student[] students = new Student[100];

    /**
     * Hello, I am a JavaDoc.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        String str1 = s1.getGroup();
        String str2 = s2.getGroup(); 
        boolean check = str1.equals(str2);
        return check;
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public void addStudent(Student newStudent) {
        int i = 0;
        while (students[i] != null && i < 100) {
            i++;
        }
        students[i] = new Student(newStudent);
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public String studentsByGroup() {
        String ans = "";
        String[] added = new String[100];
        for (int i = 0; i < 100; i++) {
            if (students[i] == null) {
                break;
            }
            if (!students[i].getGroup().equals(added[i])) {
                ans += students[i].getGroup() + "\n";
                for (int j = i; j < 100; j++) {
                    if (students[j] == null) {
                        break;
                    }
                    if (sameGroup(students[i], students[j])) {
                        added[j] = students[j].getGroup();
                        ans += students[j].getInfo() + "\n";
                    }
                }
            }
        }
        return ans;
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public void removeStudent(String id) {
        int i = 0;
        while (students[i] != null && !id.equals(students[i].getId())) {
            i++;
        }
        while (students[i + 1] != null) {
            students[i].setName(students[i + 1].getName());
            students[i].setId(students[i + 1].getId());
            students[i].setGroup(students[i + 1].getGroup());
            students[i].setEmail(students[i + 1].getEmail());
            i++;
        }
        students[i] = null;
    }
    
    public static void main(String[] args) {
    }
}