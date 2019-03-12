public class TimeTable {
    private final int DAYS = 5;
    private final int HOURS = 9;
    private final int GRIDHOURS = 4;

    private ClassDetails[][] grid;

    public TimeTable(){
        grid = new ClassDetails[DAYS][HOURS*GRIDHOURS];
    }

    public void set(int day, int hour, ClassDetails details){

        // Store specified details
        grid[day][hour*GRIDHOURS] = details;
    }

    public void display(){
        //display the grid
        System.out.printf("%10s","Timetable");
        for (int i = 0; i < DAYS; i++){
            if (i%4==0)
            System.out.printf("%30s", "Day: " + (i+1));
        }

        System.out.println();

        for (int i = 0; i < HOURS*GRIDHOURS; i++){
            if (i%4==0)
            System.out.printf("%10s","Hour: " + ((i/4)+1));
            else
                System.out.printf("%10s","");


            for (int j = 0; j < DAYS; j++){
                System.out.printf("%30s",grid[j][i]);
            }

            System.out.println("\n");
        }

    }

    public ClassDetails get (int day, int hour){
        // Returns the object at the specified position
        return grid[day][hour];
    }

    public int getNumberOfClassesFor(String name){ //e.g. number of algorithm classes
        return 0;
    }

    public int getNumberOfFreeSlots(){
        return 0;
    }
}
