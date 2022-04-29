import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.Collectors;

public class randomProg {


    public static void main(String[] args) {
         replaceSecond("srivian");
        print1to100(1);
        printSpecial("srini#$&&");
        printChar("sjdjk");
        System.out.println(countOdds(3,7));
    }

public static void printChar(String s)
{
    for (int i=0;i<s.length();i++)
        System.out.println(String.valueOf(s.charAt(i)));

    }
    public static int countOdds(int low, int high) {

        int count=0;

        for(int i=low; i<=high;i++)
        { if(i%2 !=0)
            count++;
        }
        return count;
    }


    public static void printSpecial(String s)
    {
    for(int i =0;i<s.length();i++) {
        if (!Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
            System.out.printf(String.valueOf(s.charAt(i)));
        }
    }

    }
    public static void replaceSecond(String s)
    {
        int count=0;
        String [] arr = s.split("");
        for (int i =0; i<arr.length;i++)
            { if(arr[i].equals("i") )
            {count ++;
               if(count == 2)
               { arr[i] = "h"; break;}
            }
            }
 String name = Arrays.stream(arr).collect(Collectors.joining());
        System.out.println(name);

        }

        public static void print1to100(int i)
        {

            if(i<=100)
            { System.out.print(i);
                print1to100(++i);}
        }

        }

