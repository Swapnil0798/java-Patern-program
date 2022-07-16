import java.lang.*;
import java.util.*;
import java.io.*;
/*
Enter the rows
4
Enter the cols
4
4       3       2       1
4       3       2       1
4       3       2       1
4       3       2       1
*/
class patern
{
    void display(int irow,int icol)
    {
        int i=0,j=0;
        for(i=irow;i>=1;i--)
        {
            for(j=icol;j>=1;j--)
            {
                System.out.print(j+"\t");
            }
            System.out.println(" ");
        }
    }

}

class P8
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the rows");
        int irow=sobj.nextInt();

        System.out.println("Enter the cols");
        int icol=sobj.nextInt();

        patern pobj=new patern();
        pobj.display(irow,icol);
        
    }
}