import java.lang.*;
import java.util.*;
import java.io.*;
/*
Enter the rows:
4
Enter the rows:
4
        a       b       c       d
        a       b       c       d
        a       b       c       d
        a       b       c       d
 */
class patern
{
    void display(int irow,int icol)
    {
     int i=0,j=0;
     char ch='a';
     for(i=1;i<=irow;i++)
     {
        for(j=1,ch='a';j<=icol;j++,ch++)
      {
        System.out.print("\t"+ch);
      }
      System.out.println(" ");
     }
    }
}
class P11
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