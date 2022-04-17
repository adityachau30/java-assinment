import java.util.Scanner;
//1
public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("science");
        int s = scanner.nextInt();
        System.out.println("math");
        int m = scanner.nextInt();
        System.out.println("social");
        int so = scanner.nextInt();

        double result = ((s+m+so)*100)/300;
        System.out.println(result+"%");
    }
}

//2

class Hw22{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number");
        int a = scanner.nextInt();
        System.out.println("second number ");
        int b = scanner.nextInt();
        System.out.println("third number");
        int c = scanner.nextInt();
        System.out.println("forth number");
        int d = scanner.nextInt();

        int result = (a+b+c+d);
        System.out.println("final result : " +result);
    }
}

//3

class Hw3{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("science");
        int s = scanner.nextInt();
        System.out.println("math");
        int m = scanner.nextInt();
        System.out.println("social");
        int so = scanner.nextInt();
        System.out.println("eco");
        int e = scanner.nextInt();

        double result = ((s+m+so+e)*100)/400;
        String per;

        per = (result>=70)? "first class":
                (result>=60)? "upper second class":
                        (result>=50)?"second class":
                                (result>=40)?"third class":"fail";

        System.out.println(result + "%");
        System.out.println(per);


    }

}

//4 & 5
class Hw45{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number");
        double a = scanner.nextDouble();
        System.out.println(("second number"));
        double b = scanner.nextDouble();

        double c = (a+b);
        double d = (a*b);
        double e = (c/d);

        System.out.println(c + " sum of two number");
        System.out.println(d + " product of two number");
        System.out.println(e + " division of two result");

    }
}
//6
class Hw6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("length");
        double l = scanner.nextDouble();
        System.out.println("breath");
        double b = scanner.nextDouble();

        double area = (l*b) ;
        System.out.println(area);

    }

 }

//7
class Hw7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name");
        String n = scanner.nextLine();
        System.out.println("roll number");
        String r = scanner.nextLine();
        System.out.println("intrest");
        String i = scanner.nextLine();

        System.out.println(("my name is " + n), "my roll number is " + r, "my intrest is " + i) ;

    }
}

//8
class Hw8{



}

//9
class Hw9{






}



//10
class Hw10{





}



//11
class Hw11{




}




//12
class Hw12{






}




