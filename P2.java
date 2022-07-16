import java.lang.*;
import java.io.*;
import java.util.*;
/*
Enter the no of element:
5
        A       B       C       D       E
        */
class function
{
    void display(int ino)
    {
        int icnt=0;
        char ch='A';
        for(icnt=1,ch='A';icnt<=ino;icnt++,ch++)
        System.out.print("\t"+ch);
    }
}

class P2
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the no of element:");
         
         int ivalue=sobj.nextInt();

         function fobj=new function();

         fobj.display(ivalue);

    
    }

}