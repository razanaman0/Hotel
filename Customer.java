
package project;


import java.io.*;

public class Customer {
    private String customerName;
    private String customerPhone;
    private String customerGender;
    private int customerAge;
    private Rooms room;
    private Spa spa;

    
    public Customer(String name, String phone, String gender,int age,Spa sp,Rooms r) {
        customerName = name;
        customerPhone = phone;
        customerGender = gender;
        customerAge = age;
        spa=new Spa(sp);
        room=new Rooms(r);
    }
    
    public Customer(){
        
    }

    public void setCustomerName(String name) {
        customerName = name;
    }

    public void setCustomerPhone(String phone) {
        customerPhone = phone;
    }

    public void setCustomerGender(String gender) {
        customerGender = gender;
    }

    public void setCustomerAge(int age) {
        customerAge = age;
    }
    
     public void setRoom(Rooms r){
        room=new Rooms(r);
    }
    
     public void setSpa(Spa sp){
         spa=new Spa(sp);
     }
     
    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public int getCustomerAge() {
        return customerAge;
    }
    
    public Rooms getRoom(){
        return new Rooms(room);
    }
    
    public Spa getSpa(){
        return new Spa(spa);
    }
    
    public void Book_Spa(Spa sp){
        spa=new Spa(sp);
        System.out.println(sp);
    }
    
    public void Reserve_Room(Rooms r){
        room=new Rooms(r);
        System.out.println(r);
    }
    @Override
    public String toString(){
       String str="Customer name: "+customerName+"\n"+"Customer phone: "+customerPhone+"\n"
                  +"Customer Gender: "+customerGender+"\n"+"Customer age: "+customerAge
               +"\n\n      >>>>>>> Reservation details <<<<<<<"+"\n===============================================\n"
               +room+"\n  ****************\n"+spa+"\n      *******"+"\nTotal price is $"+(room.TotalPrice()+spa.TotalPrice());
        return str;
    }
    
    public void saveReceiptToFile() throws IOException {
        PrintWriter outputFile = new PrintWriter(customerName+".txt");
        outputFile.println("\n===============================================");
        outputFile.println("      >>>>>>> Customer informaiton <<<<<<<");
        outputFile.println("===============================================\n");
        outputFile.println(toString());
        outputFile.close();
    }
   
    
    
    
    
    
    
    
    
}
