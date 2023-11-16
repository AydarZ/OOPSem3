package Domen;

import java.util.Comparator;

public class StudentGroupComporator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        int res = o1.compareTo(o2);
        if (res == 0) {
            return 0;
        } else {
            return res;
        }
    }

}
