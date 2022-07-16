import java.lang.*;
import java.util.*;
import java.io.*;
/*
Enter the rows:
4
Enter the col:
4
        1       2       3       4
        5       6       7       8
        9       10      11      12
        13      14      15      16
 */
class patern
{
    void display(int irow,int icol)
    {
     int i=0,j=0,k=1;
     
     for(i=1;i<=irow;i++)
     {
        for(j=1;j<=icol;j++)
      {
        System.out.print("\t"+k); 
        k++;  
      }
      System.out.println(" ");
     }
    }
}
class P13
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int irow=sobj.nextInt();

        System.out.println("Enter the col:");
        int icol=sobj.nextInt();

       patern pobj=new patern();
       pobj.display(irow,icol);
    }
}