public class Instructor {

    private String firstname;
    private String lastname;
    private String officebuilding;
    private int roomNumber;


    public Instructor() {
        this.firstname = "Albert";
        this.lastname = "Einstein";
        this.officebuilding = "McNair";
        this.roomNumber = 420;

    }

    public Instructor(String firstname, String lastname, String officebuilding,
                      int roomNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.officebuilding = officebuilding;
        this.roomNumber = roomNumber;
    }

    // getters and setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getOfficebuilding() {
        return officebuilding;
    }

    public void setOfficebuilding(String officebuilding) {
        this.officebuilding = officebuilding;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    //toString method is used to display the contents of an object inside it
    @Override
    public String toString() {
        return firstname + " * " + lastname + " * " + officebuilding + " * "+ roomNumber;
    }
}
