// 1 & 3
public class vote {
   public static void main(String[] args) {
       int Voteage = 21;
       String vote;

       vote = (Voteage >= 18) ? "can give a vote" : "cannot give a vote";
       System.out.println(vote);

   }
}

//2
class AreaMath {
   public static void main(String[] args) {


       // Area of traingle
       int base = 20;
       int height = 10;
       int AreaOfTriangle;

       AreaOfTriangle = ( ( base*height ) /2 );
       System.out.println(AreaOfTriangle);


       // volume of cube
       int a = 30;
       int Volumecube;

       Volumecube = (a^3);
       System.out.println(Volumecube);


       // volume of cuboid

       int length = 10;
       int width = 20;
       int Height = 30;
       int VolumeCuboid;

       VolumeCuboid = ( length*width*Height);
       System.out.println(VolumeCuboid);

   }
}

//4

class Percentage{
   public static void main(String[] args) {
       int Per = 60;

       if(Per>=70){
       System.out.println("First class");

       } else if (Per>59){
           System.out.println("upper second class");

       }else if (Per>49){
           System.out.println("second class");

       }else if (Per>39){
           System.out.println("third class");

       }else if (39<=Per){
           System.out.println("fail");
       }

   }
}
