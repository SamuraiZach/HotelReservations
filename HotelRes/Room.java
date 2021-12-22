public class Room
{
    // instance variables - replace the example below with your own
    private int roomNumber, daysRented;
    private String roomType, occupantName;

    /**
     * Constructor for objects of class Room
     */
    public Room(int x, String y)
    {
        // initialise instance variables
        roomNumber = x;
        daysRented = 0;
        occupantName = null;
        if(y == "single king" || y == "double queen" || y == "suite"){
            roomType = y;
        
        }else{
            System.out.println("Error -- Automatically choosing Double Queen");
            roomType = "double queen";
        }
    }
    public int getroomNumber(){
        return roomNumber;
    }  
    public int getdaysRented(){
        return daysRented;
    }  
    public String getroomType(){
        return roomType;
    }  
    public String getoccupantName(){
        return occupantName;
    }  
    public boolean setOccupant(String name, int days)
    {
        if(daysRented == 0){
            occupantName = name;
            daysRented = days;
            return true;
        }else{
            return false;
        }
    }   
    public void advanceDay()
    {
        if(daysRented <= 0){
            occupantName = null;
            daysRented = 0;
        }else{
            daysRented -= 1;
        }
    } 
    public String toString()
    {
        return ("Room "+roomNumber+": "+roomType+"--rented");
    } 
}