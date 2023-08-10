import java.util.ArrayList;

public class Subject implements Source
{
    private final ArrayList<MyObserver> list;
    private String score;

    public Subject() {
        list = new ArrayList<MyObserver>();
    }

    public void setScore(String input) {
        this.score = input;
        notifyObservers();
    }

    public String getScore() {
        return score;
    }

    @Override
    public void notifyObservers() {
        for (MyObserver observer : list) {
            observer.update(this);
        }
    }

    @Override
    public void register(MyObserver observer) {
        list.add(observer);
    }
}