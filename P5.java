import java.lang.*;
import java.io.*;
import java.util.*;
/*
enter the element
5
#       1       *       #       2       *       #       3       *       #       4       *       #       5       *
*/
class patern
{
   void display(int ino)
   {
    int icnt=0;
    for(icnt=1;icnt<=ino;icnt++)
    {
        System.out.print("#\t"+icnt+"\t*\t");
    }
   }
}
class P5
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the element");
         
         int ivalue=sobj.nextInt();
        patern pobj=new patern();
        pobj.display(ivalue);
    }
}