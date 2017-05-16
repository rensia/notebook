/**
 * Created by dianmink on 11-05-2017.
 */
public class Reminder extends Note {

    private String DateTime;

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Reminder{" + "Note=" + getNote() +
                " DateTime='" + DateTime + '\'' +
                '}';
    }
}
