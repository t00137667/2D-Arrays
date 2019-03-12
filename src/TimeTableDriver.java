public class TimeTableDriver {
    public static void main(String[] args) {
        TimeTable timeTable = new TimeTable();

        ClassDetails newClass = new ClassDetails("Algorithms","T302","John Walsh");

        timeTable.set(1,3,newClass);
        timeTable.set(1,4,newClass);
        timeTable.set(3,2,newClass);
        timeTable.set(3,3,newClass);
        timeTable.set(4,6,newClass);

        timeTable.display();
    }
}
