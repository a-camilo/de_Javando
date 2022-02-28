package entities;

public class RentRoom {

    private String name;
    private String email;
    private int roomNumber;

    public RentRoom(String name, String email, int roomNumber) {
        this.name = name;
        this.email = email;
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom() {
        return roomNumber;
    }

    public void setRoom(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return roomNumber + ":" + name + ", " + email;
    }
}
