package OOPS;

public class Pratice {

    public static void main(String[] args) {
        
        pen p1 = new pen();
        p1.setColour("Blue");
        p1.setTip(5);
        System.out.println("Pen Colour is:-"+p1.colour+" "+"Pen Tip is:-"+p1.tip);


        // bankAccount myacc = new bankAccount();
        // myacc.username = "anurag1211";
        // myacc.setPassword("shadbsahjfb");

    }
    
}

class pen{

    String colour;
    int tip;

    void setColour(String newColour){
        colour = newColour;
    }

    void setTip(int newTip){
        tip = newTip;
    }


}

// class bankAccount{

//     public String username;
//     private String password;
//     void setPassword(String pwd){
//       password = pwd;  
//     }
        

// }