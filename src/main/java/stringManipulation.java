import java.util.*;
import java.util.stream.Collectors;

public class stringManipulation {


    public static void main(String[] args) {
        charOnce("hello");
        repeated("hello");
        mirror("hello");
    }
    public static void charOnce(String str)
    {
        String [] dup = str.split("");
       Arrays.stream(dup).distinct().collect(Collectors.toSet()).forEach(System.out ::println);

        }

        public static void repeated(String str )
        {
            ArrayList<String> dup = new ArrayList<String>(Arrays.asList(str.split("")));
           Set<String> repeated = new HashSet<String>();
            dup.stream().filter(x -> !repeated.add(x))
                    .collect(Collectors.toSet())
                    .forEach(System.out::println);
        }

 public static void mirror(String str) {
    try {
        String reverseAlphabet = "zyxwvutsrqponmlkjihgfedcba";
        String az = "abcdefghijklmnopqrstuvwxyz";
        String za = "zyxwvutsrqponmlkjihgfedcba";
        for (int i = 0; i < str.length(); i++)
            System.out.println(za.charAt(az.indexOf(str.charAt(i))));
//     System.out.println(reverseAlphabet.charAt(str.charAt(i)-'a'));

    }catch(Exception e){}
 }
}

