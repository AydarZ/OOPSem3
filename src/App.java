import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;
import Domen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Вася", 22);
        Student s4 = new Student("Миша", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s4);

        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s4);
        listStud3.add(s5);
        listStud3.add(s6);

        StudentGroup group1 = new StudentGroup(listStud1, 11);
        System.out.println(group1);

        for (Student std : group1) {
            System.out.println(std);
        }

        StudentGroup group2 = new StudentGroup(listStud2, 22);
        System.out.println(group2);

        for (Student std : group2) {
            System.out.println(std);
        }

        StudentGroup group3 = new StudentGroup(listStud3, 33);
        System.out.println(group3);

        for (Student std : group3) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        // Collections.sort(group1.getGroup());

        // for (Student std : group1.getGroup()) {
        // System.out.println(std);
        // }

        // Teacher t1 = new Teacher("Галина", 55, "Docent");
        // Teacher t2 = new Teacher("Татьяна", 57, "Docent");

        // System.out.println(new PersonComparator<Student>().compare(s1, s3));

        // AccountController controller = new AccountController();
        // controller.paySalary(t1, 50000);
        // controller.paySalary(s1, 50000);

        // AccountController.paySalary(t1, 50000);

        // System.out.println(AccountController.averageAge(listStud));

        List<StudentGroup> listGroup1 = new ArrayList<StudentGroup>();
        listGroup1.add(group1);
        listGroup1.add(group2);
        listGroup1.add(group3);
        StudentSteam steam1 = new StudentSteam(333, listGroup1);
        System.out.println(steam1);

        for (StudentGroup group : steam1) {
            System.out.println(group);
        }

        // List<StudentGroup> listGroup2 = new ArrayList<StudentGroup>();
        // listGroup2.add(group3);
        // StudentSteam steam2 = new StudentSteam(777, listGroup2);
        // System.out.println(steam2);

        // for (StudentGroup group : steam2) {
        //     System.out.println(group);
        // }

        Collections.sort(steam1.getSteam());

        for (StudentGroup group : steam1) {
            System.out.println(group);
        }

    }
}
