import java.lang.*;
import java.util.*;
import java.io.*;
/*
Enter the rows:
4
Enter the rows:
4
        4       4       4       4
        3       3       3       3
        2       2       2       2
        1       1       1       1
 */
class patern
{
    void display(int irow,int icol)
    {
     int i=0,j=0;
     
     for(i=irow;i>=1;i--)
     {
        for(j=1;j<=icol;j++)
      {
        System.out.print("\t"+i);
      }
      System.out.println(" ");
     }
    }
}
class P12
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int irow=sobj.nextInt();

        System.out.println("Enter the rows:");
        int icol=sobj.nextInt();

       patern pobj=new patern();
       pobj.display(irow,icol);
    }
}