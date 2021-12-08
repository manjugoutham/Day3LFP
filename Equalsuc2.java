import java.util.Scanner;
class Equalsuc2
{
        public static void main(String arg[])

        {

                 int x1,x2,y1,y2,x3,x4,y3,y4;
                 
                 
                 double len1,len2;

                 Scanner sc=new Scanner(System.in);

                 System.out.println("Line 1 details \n"
                 		+ "enter x1 point");

                 x1=sc.nextInt();

                 System.out.println("enter y1 point");

                 y1=sc.nextInt();

                 System.out.println("enter x2point");

                 x2=sc.nextInt();

                 System.out.println("enter y2 point");
                 y2=sc.nextInt();
                 
                 System.out.println("Line 2 details \n enter x3 point");

                 x3=sc.nextInt();

                 System.out.println("enter y3 point");

                 y3=sc.nextInt();

                 System.out.println("enter x4 point");

                 x4=sc.nextInt();

                 System.out.println("enter y4 point");

                 y4=sc.nextInt();
                 
                 

                 len1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

                 len2=Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
                 
                 if(len1==len2)
                 {
                  System.out.println("Two lines are equal"); 
                 }
                 else if(len1>len2)
                 {
                	 System.out.println("Lines1 is greater than line2");  
                 }
                 else
                 {
                	 System.out.println("Lines1 is smaller than line2"); 
                 }
                	 
                 //System.out.println("lengthbetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")=>"+len1);

        }
}
