import java.util.Iterator;

public class Grade implements Iterable{
    private Subject subject;
    private int mark;

    public int getMark() {
        return mark;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    Grade(Subject subj, int m) {
        this.subject = subj;
        this.mark = m;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "subject=" + subject +
                ", mark=" + mark +
                '}';
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
