import java.lang.*;
import java.io.*;
import java.util.*;
class Patern1
{
    void patern(int ino)
    {
        int icnt=0;
        for(icnt=1;icnt<=ino;icnt++)
        {
            if(icnt%2==0)
            {
                System.out.println("the even element is: \t"+icnt);
            }
        }
    }

}
class P1
{
    public static void main(String args[])
    {

        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the value");
        
        int ivalue=sobj.nextInt(); 

        Patern1 pobj=new Patern1();

        pobj.patern(ivalue);
        
             

    }
}

