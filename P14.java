import java.lang.*;
import java.util.*;
import java.io.*;
/*
 */
class patern
{
    void display(int irow,int icol)
    {
     int i=1,j=1,k=1;
     
     for(i=1;i<=irow;i++)
     {
        for(j=1;j<=icol;j++)
        {
            if((i==irow)||(j==icol)||(i==1)||(j==1))
            {
                System.out.print("*\t");
            }
            
            else 
            {
                System.out.print(k+"\t");
                k++;
            }
        }
        System.out.println(" ");
     }
    }
}
class P14
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