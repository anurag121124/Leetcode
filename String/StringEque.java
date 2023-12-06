package String;

public class StringEque {
    public static void main(String[] args) {

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println();
        
    }

    public boolean arrayStringAreEqu(String[] word1,String[] word2){
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        for(String s1 : word1) w1.append(s1);
        for(String s2 : word2) w2.append(s2);
       return  w1.toString().equals(w2.toString());
        
        
    }
}
