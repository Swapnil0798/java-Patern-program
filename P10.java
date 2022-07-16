import java.lang.*;
import java.util.*;
import java.io.*;
/*
Enter the rows:
4
Enter the rows:
4
        A       B       C       D
        A       B       C       D
        A       B       C       D
        A       B       C       D
 */
class patern
{
    void display(int irow,int icol)
    {
     int i=0,j=0;
     char ch='A';
     for(i=1;i<=irow;i++)
     {
        for(j=1,ch='A';j<=icol;j++,ch++)
      {
        System.out.print("\t"+ch);
      }
      System.out.println(" ");
     }
    }
}
class P10
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