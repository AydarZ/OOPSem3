package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<StudentGroup> {
    private int counter;
    private List<StudentGroup> studentSteam;

    public StudentGroupIterator(List<StudentGroup> steam) {
        this.studentSteam = steam;
        this.counter=0;
    }

    @Override
    public boolean hasNext() {
        return counter<studentSteam.size();
    }

    @Override
    public StudentGroup next() {
        if(!hasNext())
        {
            return null;
        }
        //counter++;
        return studentSteam.get(counter++);
    }

}
