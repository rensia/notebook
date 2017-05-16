import java.util.ArrayList;

/**
 * Created by dianmink on 11-05-2017.
 */
public class Person extends Note {

    private String firstName;
    private String lastName;
    //    private String phone;
    ArrayList<String> phone;
    private String email;
    private String address;


    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }

//    public int getId() {
//        return id;
//    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


//    public String getPhone[]() {
//        return phone;
//    }

//    public void setId(int id) {
//        this.id = id;
//    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(ArrayList<String> phone) {
        this.phone = phone;
    }

    //    public void setPhone(String phone) {
//        this.phone = phone;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' + " note='" + getNote() +
                '}';
    }


}
