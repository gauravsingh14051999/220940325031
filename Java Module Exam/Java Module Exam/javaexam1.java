import java.util.*;
public class javaexam1 {
    public static void main(String args[ ]){
        ArrayList<String> l=new ArrayList<String>();
        l.add("Red");
        l.add("Blue");
        l.add("Green");
        l.add("Yellow");
        System.out.println("Arralist is: "+l);
        for (String colour:l)
        {
            System.out.println(colour);
        }

    }

}

