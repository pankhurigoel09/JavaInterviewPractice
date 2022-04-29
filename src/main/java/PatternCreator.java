public class PatternCreator {

    public static void main(String[] args) {
        pyramidPatternOddStar();
sample();
    }

    public static void pyramidPatternOddStar()
    {
// *
//   ***
//  *****
// *******
//*********
//        code to get 5 odd number
int count=0,i=0;
        while(count<5) {
            if(i%2!=0)
            { count++;
                for(int j=i;j>0;j--)
            {
                System.out.print("*");
            }}
            System.out.print("\n");
            i++;
        }
    }

    public static void sample() {
        int i, j, k;
        for(i=1;i<=5;i++)
        {
            for(j=i;j<5;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<(i*2);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=4;i>=1;i--)
        {
            for(j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<(i*2);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
