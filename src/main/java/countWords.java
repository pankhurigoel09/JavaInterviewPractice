import java.util.Arrays;
import java.util.stream.Collectors;

public class countWords {

    public static void main(String[] args) {

        String str = "My name is pankhuri Goel";
        System.out.println("String in Reveresed :"+ReverseWords2(str));
        System.out.println("Count of words in string :"+countWords(str));


    }
    public static int countWords(String str)
    {
       return (int) Arrays.stream(str.split(" ")).count();
    }



    public static String ReverseWords2(String str)
    { String reverse="";
        String [] a =str.split(" ");
       for(int i= a.length-1;i>0;i--)
           reverse +=a[i]+" ";
       return reverse;
    }



    }

