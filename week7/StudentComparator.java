import java.util.*;

public class StudentComparator implements Comparator {
	@Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if (s1.getCgpa() < s2.getCgpa()) return 1;
        else if (s1.getCgpa() > s2.getCgpa()) return -1;
        else {
            if (s1.getFname().compareTo(s2.getFname()) > 0) return 1;
            else if (s1.getFname().compareTo(s2.getFname()) < 0) return -1;
            else {
                if (s1.getId() < s2.getId()) return -1;
                else if (s1.getId() < s2.getId()) return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double CGPA = sc.nextDouble();
            Student std = new Student(id, name, CGPA);
            studentList.add(std);
        }
        Collections.sort(studentList,new StudentComparator());
        for (int i = 0; i < n; i++) {
            System.out.println(studentList.get(i).getFname());
        }
    }
}
