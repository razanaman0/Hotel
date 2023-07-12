
package project;

public class Spa implements Hotel {
    private boolean takeSauna;
    private boolean takeMoroccanBath;
    private boolean takeMassage;


    public Spa(boolean sauna,boolean moroccanBath,boolean massage){
        takeSauna=sauna;
        takeMoroccanBath=moroccanBath;
        takeMassage=massage;
    }
    
    
    public Spa(Spa object){
        takeSauna=object.takeSauna;
        takeMoroccanBath=object.takeMoroccanBath;
        takeMassage=object.takeMassage;
    }

    public void setSauna(boolean sauna) {
        takeSauna = sauna;
    }

    public void setMoroccanBath(boolean moroccanBath) {
        takeMoroccanBath = moroccanBath;
    }

    public void setMassage(boolean massage) {
        takeMassage = massage;
    }
    
    public boolean getSauna() {
        return takeSauna;
    }

    public boolean getMoroccanBath() {
        return takeMoroccanBath;
    }

    public boolean getMassage() {
        return takeMassage;
    }
    @Override
    public double TotalPrice() {
        double totalPrice=0;
        if(takeSauna){
            totalPrice+=100;
        }
        if(takeMoroccanBath){
            totalPrice+=100;
        }
        if(takeMassage){
            totalPrice+=100;
        }
        return totalPrice;
    }
    

    @Override
    public String toString(){
        String str,BookSauna,BookMoroccanBath,BookMassage; 
        if(takeSauna==false && takeMoroccanBath==false && takeMassage==false){
            return "There is no reservation for the spa";
        }
        else{
        BookSauna=takeSauna ? "Yes" : "No";
        BookMoroccanBath=takeMoroccanBath ? "Yes" : "No";
        BookMassage=takeMassage ? "Yes" : "No";
        }
        str="Price $"+TotalPrice();
        return "Book Massage: "+BookMassage+"\nBook Sauna: "+BookSauna
                +"\nBook Moroccan Bath: "+BookMoroccanBath+"\n"+str;
                    
    }
    
    

    
    
    
    

    
    
    
    
    
}
