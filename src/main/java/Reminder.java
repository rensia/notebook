import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by dianmink on 11-05-2017.
 */
public class Reminder extends Note {

    private LocalDateTime DateTime;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");


    public LocalDateTime getDateTime() {
        return DateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        DateTime = dateTime;
    }

    public void setDateTime(String strTime) {
//convert string to datetime
//       DateTime=LocalDateTime.parse(strTime);
        DateTime = LocalDateTime.parse(strTime, fmt);

    }

    @Override
    public String toString() {
        return "Reminder{" + "Note=" + getNote() +
                " DateTime='" + DateTime + '\'' +
                '}';
    }
}
