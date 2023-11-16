package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    private int SteamNum;
    private List<StudentGroup> steam;

    public List<StudentGroup> getSteam() {
        return this.steam;
    }

    public StudentSteam(int steamNum, List<StudentGroup> steam) {
        SteamNum = steamNum;
        this.steam = steam;
    }

    public int getSteamNum() {
        return SteamNum;
    }

    public void setSteam(List<StudentGroup> newSteam) {
        this.steam = newSteam;
    }

    @Override
    public String toString() {
        return "StudentSteam [номер потока=" + SteamNum + ", поток=" + steam + "]";
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupIterator(steam);
    }

    


}
