package OOPS;

public class Inheritance {

    public static void main(String[] args) {

        fish shark = new fish();

        shark.eat();
        
    }

   static class animal{

        String color;

        void eat(){
            System.out.println("Eats");

        }

        void breath(){
            System.out.println("Breath");
        }
    }


   static class fish extends animal{

        int fins;
        void swim(){
            System.out.println("swaims in water");
        }


    }

    
}
