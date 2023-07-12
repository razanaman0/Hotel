
package project;

public class Rooms implements Hotel{
    private int roomNum;
    private String roomType;
    private int durationDay;
    private double pricePerDay;

    
    public Rooms(){
        
    }
    
    public Rooms(Rooms object){
        roomNum = object.roomNum;
        roomType = object.roomType;
        durationDay = object.durationDay;
        pricePerDay = object.pricePerDay;
    }

    public void setRoomNumber(int numberOfRoom) {
        roomNum = numberOfRoom;
    }

    public void setRoomType(String typeOfRoom) {
        roomType = typeOfRoom;
    }

    public void setDay(int day) {
        durationDay = day;
    }

    public void setPricePerDay(double price) {
        pricePerDay = price;
    }

    public int getRoomNumber() {
        return roomNum;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getDay() {
        return durationDay;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    
     @Override
    public double TotalPrice(){
        return pricePerDay*durationDay;
    }
    
    public String HotelInof(){
       return "\n"+hotelName + "\nWork hours: " + Workhours + "\nReception Phone: "+ receptionPhone;
    }

    @Override
    public String toString() {
        return "Room number: "+roomNum+"\n"+"Room type: "+roomType+"\n"
                +"Duration days: "+durationDay+"\n"+"Price: $"+ TotalPrice();
    }
    

    
    
    
    
    
    
    
    
}
