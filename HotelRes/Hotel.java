import java.util.Arrays;
public class Hotel
{
    // instance variables - replace the example below with your own
    private int totalRooms;
    private String hotelName;
    private int[] rooms;
    /**
     * Constructor for objects of class Hotel
     */
    public Hotel(String name, int totroom, int floors){
        totalRooms = totroom;
        hotelName = name;
        int numFloors = floors;
        // USE A FOR LOOP WITH an N VARIABLE FOR increasing rooms match with total rooms
        rooms = new int[totalRooms];
        int roomFloor = 100;
        int roomPerfloor = (totalRooms/numFloors);
        for (int i = 0; i < totalRooms; i++) {  
            if(rooms[i] == (roomFloor + roomPerfloor)){
                roomFloor += 100;
                i = 0;
                rooms[i]= roomFloor + i;
                System.out.println(rooms[i]);
            }else{
                rooms[i]= roomFloor + i;
                System.out.println(rooms[i]);
            }
        }
        System.out.println(Arrays.toString(rooms));
    }
}
