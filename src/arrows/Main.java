package arrows;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("       -  ");
        System.out.println("        - ");
        System.out.println("----------");
        System.out.println("        - ");
        System.out.println("       -  \n\n");

        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if((i==3 && j==7) | (i==7 && j==7))
                    System.out.print("*");
                else if((i==4 && j==8) | (i==6 && j==8))
                    System.out.print("*");
                else if(i==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
