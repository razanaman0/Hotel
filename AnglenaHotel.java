
package project;
import java.io.*;
import java.util.*;
public class AnglenaHotel {

    public static void main(String[] args) throws IOException {
    Scanner keyboard=new Scanner(System.in);
    Rooms Room =new Rooms();
    Customer customer=new Customer();
    String name,gender,phone,select,massage,sauna,moroccanBath;
    boolean Massage=false,Sauna=false,MoroccanBath=false;
    int age,choice,roomNumber,roomType,Days;
    ArrayList<String> List=new ArrayList<>();
    int[] roomType1={200,220,155};
    int[] roomType2={125,80,205,203};
    int[] roomType3={338,170,115};
    System.out.println("****************************************");
    System.out.println("\tWelcome to Anglena hotel");
    System.out.println("****************************************");
do{
    System.out.println("\nchoose one from the options:");
    System.out.println("1- Display hotel information");
    System.out.println("2- Start booking");
    System.out.println("3- Display receipt");
    System.out.println("4- Display all reservation");
    System.out.println("5- Exit");
    System.out.print("Please enter your choice: ");
    choice=keyboard.nextInt();
    keyboard.nextLine();
    
    if(choice==1){
        System.out.println(Room.HotelInof());
    }
    else if(choice==2){
        System.out.print("\nEnter Customer name: ");
        name=keyboard.nextLine();
        System.out.print("Enter Customer phone number: ");
        phone=keyboard.nextLine();
        while(phone.length()>10 || phone.length()<10){
           System.out.print("Invalid phone number, please enter a valid phone number: ");
           phone=keyboard.nextLine(); 
        }
        System.out.print("Enter Customer gender: ");
        gender=keyboard.nextLine();
        while (!(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female"))){
            System.out.print("Please enter again (only male or female): ");
            gender=keyboard.nextLine();
        }
        System.out.print("Enter Customer Age: ");
        age=keyboard.nextInt();
        while(age<18 || age>100){
        System.out.print("Please enter again Customer Age: ");
        age=keyboard.nextInt(); 
        keyboard.nextLine();
    }
        System.out.println("\n         **************");
        
                
        do{System.out.println("Rooms we offered and their prices :"
            + "\n1.Double Room  *Price per day $200*"
            + "\n2.Single Room  *Price per day $100*"
            + "\n3.twin Room    *Price per day $150*");
        System.out.print("\nchoose Room type: ");
        roomType=keyboard.nextInt();
                
        switch(roomType){
        case 1:
            Room.setRoomType("Double Room ");
            System.out.println("Available rooms:");
            for(int i=0;i<roomType1.length;i++){
                System.out.print(roomType1[i]+" ");
            }
            System.out.print("\nEnter room number:");
            roomNumber=keyboard.nextInt();
            
            while(roomNumber!=roomType1[0] && roomNumber!=roomType1[1] && roomNumber!=roomType1[2]){
                System.out.println("Room doesn't exist\nPlease enter again room number: ");
                roomNumber=keyboard.nextInt();
            }
            Room.setRoomNumber(roomNumber);
            System.out.println("how long would you stay?");
            Days=keyboard.nextInt();
            while(Days<1 || Days>30) {
                System.out.println("Invalid number of days, please enter a valid number of days (1-30): ");
                Days=keyboard.nextInt();
            }
            Room.setDay(Days);
            Room.setPricePerDay(200.0);
            System.out.println("\nRoom booked:");
            System.out.println("==================");
            customer.Reserve_Room(Room);
            break;
        case 2:   
            Room.setRoomType("Single Room ");
            System.out.println("Available rooms:");
            for(int i=0;i<roomType2.length;i++){
                System.out.print(roomType2[i]+" ");
            }
            System.out.print("\nEnter room number:");
            roomNumber=keyboard.nextInt();
            while(roomNumber!=roomType2[0] && roomNumber!=roomType2[1] && roomNumber!=roomType2[2] && roomNumber!=roomType2[3]){
                System.out.println("Room doesn't exist\nPlease enter again room number: ");
                roomNumber=keyboard.nextInt();
            }
            Room.setRoomNumber(roomNumber);
            System.out.println("how long would you stay?");
            Days=keyboard.nextInt();
            while (Days<1 || Days>30) {
                System.out.println("Invalid number of days, please enter a valid number of days (1-30): ");
                Days=keyboard.nextInt();
            }
            Room.setDay(Days);
            Room.setPricePerDay(100.0);
            System.out.println("\nRoom booked:");
            System.out.println("==================");
            customer.Reserve_Room(Room);
            break;
        case 3:
            Room.setRoomType("Twin Room");
            System.out.println("Available rooms:");
            for(int i=0;i<roomType3.length;i++){
                System.out.print(roomType3[i]+" ");
            }
            System.out.print("\nEnter room number:");
            roomNumber=keyboard.nextInt();              
            while(roomNumber!=roomType3[0] && roomNumber!=roomType3[1] && roomNumber!=roomType3[2]){
                System.out.println("Room doesn't exist\nPlease enter again room number: ");
                roomNumber=keyboard.nextInt();
            }
            Room.setRoomNumber(roomNumber);
            System.out.println("how long would you stay?");
            Days=keyboard.nextInt();
            while (Days<1 || Days>30) {
                System.out.println("Invalid number of days, please enter a valid number of days (1-30): ");
                Days=keyboard.nextInt();
            }
            Room.setDay(Days);
            Room.setPricePerDay(150.0);
            System.out.println("\nRoom booked:");
            System.out.println("==================");
            customer.Reserve_Room(Room);
            break;
        default:
            System.out.println("Invalid choice, please enter a valid choice\n");
            }
        }while(roomType>3 || roomType<1);
                
        keyboard.nextLine();
        System.out.println("\n         **************");
        System.out.println("Do you want Spa services?(yes or no)");
        select=keyboard.nextLine();
        while (!(select.equalsIgnoreCase("yes")||select.equalsIgnoreCase("no"))){
                System.out.println("Please enter again (only yes or no)");
                select=keyboard.nextLine();
            }
            if(select.equalsIgnoreCase("yes")){
            System.out.println("We offer three services:\n1-Sauna\n2-Moroccan bath\n3-massage");
            System.out.println("Do you want Massage service?(yes/no)");
            massage=keyboard.nextLine();
            while (!(massage.equalsIgnoreCase("yes")||massage.equalsIgnoreCase("no"))){
                System.out.println("Please enter again (only yes or no)");
                massage=keyboard.nextLine();
            }
            System.out.println("Do you want Sauna service?(yes/no)");
            sauna=keyboard.nextLine();
            while (!(sauna.equalsIgnoreCase("yes")||sauna.equalsIgnoreCase("no"))){
                System.out.println("Please enter again (only yes or no)");
                sauna=keyboard.nextLine();
            }
            System.out.println("Do you want Moroccan bath service?(yes/no)");
            moroccanBath=keyboard.nextLine();
            while (!(moroccanBath.equalsIgnoreCase("yes")||moroccanBath.equalsIgnoreCase("no"))){
                System.out.println("Please enter again (only yes or no)");
                moroccanBath=keyboard.nextLine();
            }
            Massage=false;
            Sauna=false;
            MoroccanBath=false;

            if (massage.equalsIgnoreCase("yes")){
                Massage=true;
            }
            if (sauna.equalsIgnoreCase("yes")){
                Sauna=true;
            }
            if (moroccanBath.equalsIgnoreCase("yes")){
                MoroccanBath=true;
            }
            }
            else if(select.equalsIgnoreCase("no")){
                Massage=false;
                Sauna=false;
                MoroccanBath=false;
            }
            Spa spa=new Spa(Sauna,MoroccanBath,Massage);
            Customer cus=new Customer(name,phone,gender,age,spa,Room);
            System.out.println("\nSpa booked:");
            System.out.println("==================");
            cus.Book_Spa(spa);  
            List.add(cus.toString());
            cus.saveReceiptToFile();
    }
 
    else if(choice==3){
        System.out.println("Enter the name of the customer: ");
        String NAME=keyboard.nextLine();
        
        File file=new File(NAME+".txt");
        if(file.exists()){
              Scanner inputFile = new Scanner(file);
              while (inputFile.hasNextLine()) {
                String line = inputFile.nextLine();
                System.out.println(line);
              }
              inputFile.close();
        }
        else{
           System.out.println("this customer is not found");
        }
        }
    else if(choice==4){
        for(int i=0;i<List.size();i++){
            System.out.println("\n    >>>>>> Reservation details for customer "+(i+1)+" <<<<<<\n");
            System.out.println(List.get(i)+"\n---------------------");
        }
    }
    else if(choice==5){
        System.out.println("Thank you for visiting our hotel, Have a nice day\nGood Bye!");
    }
        }while(choice!=5);
        
        
}
 
}
    
    