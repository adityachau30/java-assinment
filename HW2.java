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

        System.out.print("my name is " + n, "my roll number is " + r, "my intrest is " + i) ;

    }
}

// hw 8

class mathematical_calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of Square:");
        double a = scanner.nextDouble();
        double area = a*a;
        double perimeter = 4*a;
        System.out.print("The Area of Square is: "+area);
        System.out.println(" and the perimeter of square is: "+perimeter);
    }
}
class si{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter Time: ");
        double b = scanner.nextDouble();
        System.out.print("Enter Rate: ");
        double c = scanner.nextDouble();
        double d;
        d = (a*b*c)/100;
        System.out.println("S.I. is : " +d);

    }
}
class area_triangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base of Triangle:");
        double base = scanner.nextDouble();
        System.out.println("Enter Height of Triangle:");
        double height = scanner.nextDouble();
        double area ;
        area = 0.5*base*height;
        System.out.println("Area of Triangle is: " +area);
    }
}
class volume_cube{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of Cube:");
        double length = scanner.nextDouble();
        double volume;
        volume = length*length*length;
        System.out.println(volume);
    }
}
class volume_cuboid{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of Triangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter Width of Triangle:");
        double width = scanner.nextDouble();
        System.out.println("Enter Height of Triangle:");
        double height = scanner.nextDouble();
        double volume;
        volume= length*width*height;
        System.out.println(volume);
    }
}

//9
class Hw9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int a = scanner.nextInt();
        int result;
        result = a*a;
        System.out.println(result);

    }

}


//10
class Hw10{
    public static void main(String[] args) {
        System.out.print("hello");
        System.out.print(" aditya");
    }

}



//11
class Hw11{
    public static void main(String[] args) {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a Number: ");
            int a  = scanner.nextInt();
            System.out.print("Enter second Number: ");
            int b  = scanner.nextInt();
            System.out.print("Enter third Number: ");
            int c  = scanner.nextInt();
            String check;
            check = ((a==b)&&(b==c))?"All the Numbers are equal":((a==b)||(b==c)||(a==c))?"Two Numbers are Equal":"None Numbers are Equal";
            System.out.println(check);
    }
}


//12
class Hw12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a  = scanner.nextInt();
        System.out.print("Enter another Number: ");
        int b  = scanner.nextInt();
        String c;
        c = ((a<50)&&(a<b))?"Both Condition i.e. a<50 and a<b is True":"Both Condition i.e. a<50 and a<b is False";
        System.out.println(c);
    }
}



//13
class Hw13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter MArk of 1st Subject: ");
        double a = scanner.nextDouble();
        System.out.print("Enter MArk of 2nd Subject: ");
        double b = scanner.nextDouble();
        System.out.print("Enter MArk of 3rd Subject: ");
        double c = scanner.nextDouble();
        double total_mark;
        double percentage;
        total_mark = a+b+c;
        System.out.println("Total Marks is :" + total_mark);
        percentage = total_mark/4;
        System.out.println("Total Percentage is :" + percentage);
    }
}



















