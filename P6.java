import java.io.*;
import java.lang.*;
import java.util.*;
/*
Enter the rows:
4
Enter the cols:
4
*       *       *       *
*       *       *       *
*       *       *       *
*       *       *       *
*/
class patern
{
    void display(int irow,int icol)
    {
      int i=0,j=0;
      for(i=1;i<=irow;i++)
      {
        for(j=1;j<=icol;j++)
        {
            System.out.print("*\t");
        }
        System.out.println(" ");
      }
      
    }

}
class P6
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the rows:");
        int irow=sobj.nextInt();

        System.out.println("Enter the cols:");
        int icol=sobj.nextInt();

        patern pobj=new patern();
        pobj.display(irow,icol);
    }
}