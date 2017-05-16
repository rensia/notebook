/**
 * Created by dianmink on 09-05-2017.
 */
public abstract class Record {

    private static int recordCount; //static - belongs to class, non static belongs to objects, not static are accessible only after creTING AN OBJECT
    private int id;


    public Record() {
        recordCount++;
        id = recordCount;
    }

    public int getId() {
        return id;
    }

}
