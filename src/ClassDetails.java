public class ClassDetails {
    private String name;
    private String roomNumber;
    private String lecturer;


    public ClassDetails(String name, String roomNumber, String lecturer) {
        this.name = name;
        this.roomNumber = roomNumber;
        this.lecturer = lecturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public String toString() {
        return " " + name + " " + roomNumber + " " + lecturer;
    }
}
