import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class duplicateElements {

    public static void main(String[] args) {
        giveDuplicateJ8("Hello my name Hello");
        giveDuplicateJ8("");
        giveDuplicateJ8(" sssssnk sjc sjc");
        giveDuplicateJ8("123454397");
        giveDuplicateJ7("Hello my name Hello");
        giveDuplicateJ7("scdscs ");
    }

    public static void giveDuplicateJ7(String str)
    {
//        String str= "Hello my name Hello";
     if(str.equals(null)||str.isEmpty()||str.length()==1)
     {
         System.out.println("No duplicate please");
     }
     String[] a = str.split("\\W");
        if(a.length==1)
        {
            System.out.println("No duplicate please");
        }
        HashMap <String,Integer> word = new HashMap<>();

        for (String w :a) {
            if(word.containsKey(w))
            {
                word.put(w, word.get(w)+1);
            }
            else
                word.put(w,1);
        }

        //Print duplicate
               for (String dup: word.keySet())
             {
            if(word.get(dup)>1) System.out.println(dup +"::"+word.get(dup));
        }
    }

    public static void giveDuplicateJ8(String str)
    {
        if(str.equals(null)||str.isEmpty())
            System.out.println("No dupicate");
      List <String> list=  Arrays.asList(str.split("\\W"));
        List <Integer> list2=  Arrays.asList(1,366,8);
      if(list.size() == 1)
      { System.out.println("No duplicate");}

           list.stream().filter(e -> Collections.frequency(list,e)>1).
                   collect(Collectors.toSet()).forEach(x ->System.out.println(x));

    }
}
