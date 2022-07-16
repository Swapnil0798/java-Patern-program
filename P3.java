import java.lang.*;
import java.io.*;
import java.util.*;
/*
enter the elemenet:
5
5       #       4       #       3       #       2       #       1       #
*/
class P4
{
    void display(int ino)
    {
        int icnt=0;
        for(icnt=ino;icnt>=1;icnt--)
        {
            System.out.print(icnt+"\t#\t");
        }
    }
}
class P3
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the elemenet:");
        int ivalue=sobj.nextInt();

        P4 pobj=new P4();
        pobj.display(ivalue);
    }
}