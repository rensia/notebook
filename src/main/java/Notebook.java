import asg.cliche.Command;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by dianmink on 09-05-2017.
 */
public class Notebook {

    ArrayList<Record> records = new ArrayList<>();


    @Command
    public ArrayList<Record> list() {
        return records;

    }

    @Command
    public Record createPerson(String firstName, String lastName, String address, String email, String nottt, String... phone) {
        Person result = new Person();
//        records.size(); //can be used for autogeneration id but not so good

        result.setFirstName(firstName);
        result.setLastName(lastName);
//        result.setPhone(phone);
        result.setPhone(new ArrayList<>(Arrays.asList(phone)));
        result.setAddress(address);
        result.setEmail(email);
        result.setNote(nottt);
        records.add(result); //add record to array list
        return result;

    }

    @Command
    public Record createNote(String note) {
        Note note1 = new Note();
        note1.setNote(note);
        records.add(note1);
        return note1;
    }

    @Command
    public Record createReminder(String rem, String date) {
        Reminder remind = new Reminder();
        remind.setNote(rem);
        remind.setDateTime(date);
        records.add(remind);
        return remind;
    }


    @Command
    public void remove(int id) {

//        records.get(id);
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i) == records.get(id)) {
                records.remove(i - 1);

            }
        }

    }


}
