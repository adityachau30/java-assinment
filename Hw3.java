//Hw 3

//HW1

public class HW3{
    public static void main(String[] args) {

        String fname = JOptionPane.showInputDialog("Enter your first name: ");
        String lname = JOptionPane.showInputDialog("Enter your last name: ");
        String rollno = JOptionPane.showInputDialog("Enter your Rollno.: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        String address = JOptionPane.showInputDialog("Enter your address: ");
        String batch = JOptionPane.showInputDialog("Enter your batch: ");

        JOptionPane.showMessageDialog(null,"----- User Data ----- \n Name:"+fname+" "+lname+"\nBatch: "+batch+"\nRollno. "+rollno+"\nAddress: "+address);
        JOptionPane.showMessageDialog(null,"------Student details-----");
        JOptionPane.showInputDialog(null,"NAME: " + fname);
        JOptionPane.showMessageDialog(null," " + lname);
        JOptionPane.showMessageDialog(null,"Batch: " + batch);
        JOptionPane.showMessageDialog(null,"AGE: " + age);
        JOptionPane.showMessageDialog(null,"ADDRESS: " + address);

    }
}

class HW2{
    public static void main(String[] args) {
        double num1, num2, num3, num4;
        Scanner scanner = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Enter four number: ");

        num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"1st num"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"2nd num"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog(null,"3rd num"));
        num4 = Double.parseDouble(JOptionPane.showInputDialog(null,"4th num"));


        double sum = num1+num2+num3+num4;
        String eq = num1 +"+"+num2+"+"+num3+"+"+num4;
        JOptionPane.showMessageDialog(null,"The sum of four numbers are:: \n"+eq+"\n"+sum);

    }
}

class HW3{
    public static void main(String[] args) {
        double eng, math, sci, com;
        Scanner op=new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Enter marks of four subjects:");
        eng = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of English subjects:"));
        math = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of Maths subjects:"));
        sci = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of Science subjects:"));
        com = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of Computer subjects:"));


        int total =(int) ((eng + math + sci + com)/400*100);
        int percentage = total;

        JOptionPane.showMessageDialog(null,"The obtained marks is--\n"+percentage+"\u0025");
    }
}

class HW4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter 1st num: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter 2nd num: "));

        double sum = num1 +num2;
        JOptionPane.showMessageDialog(null,"The of two integer "+num1+" and "+num2+" = "+sum);

    }
}

class HW5{
    public static void main(String[] args) {

        Double length = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter length of rectangle: "));
        Double breadth = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter length of rectangle: "));
        Double area = length * breadth;
        JOptionPane.showMessageDialog(null,"The are of reactangle is: "+area);
    }
}

class HW6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = JOptionPane.showInputDialog(null, "Enter your name: ");
        String interest = JOptionPane.showInputDialog(null, "Enter your interest: ");
        int rollno = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your Roll no.: "));


        JOptionPane.showMessageDialog(null,"Hey,\n" +
                " Hey my name is"+ name +"and my roll number is "+rollno+". My field of interest are "+interest+".");
        JOptionPane.showMessageDialog(null," Hey my name is"+ name +" and my roll number is "+rollno+". My field of interest are "+interest+"." );

    }
}


class HW7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double len = Double.parseDouble(JOptionPane.showInputDialog(null,"For area and volume of square\n"+"Enter the length of a square"));

        int area = (int)(len * len);
        int volume = (int)(len*len*len);
        int volume_cube = area*area*area;

        JOptionPane.showMessageDialog(null,"The input length of square is: "+len+"\n"+"The area  of square is : "+area+"\n"+"The volume  of square is : "+volume+"\n"+
                "Using the same length of square- "+len+" as length of cube.\n"+"The volume of cube is: "+volume_cube);

        double len_tri = Double.parseDouble(JOptionPane.showInputDialog(null,"For area of triangle: "+"Enter the length of a triangle: "));
        double height_tri = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the length of a triangle: "));
        double area_tri = (len_tri*height_tri)/2;


        JOptionPane.showMessageDialog(null,"The area of triangle is : "+area_tri);
    }
}


class HW8{
    public static void main(String[] args) {
        double num = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number you want tot square: "));

        int square = (int)num * (int)num;
        int cube = (int)num * (int)num *(int)num;

        JOptionPane.showMessageDialog(null,"The square of input number is: "+square);
        JOptionPane.showMessageDialog(null,"The cube of input number is: "+cube);
    }
}


class HW9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Enter string: ");
        String str1 = scanner.nextLine();
        JOptionPane.showMessageDialog(null,"Enter second string: ");
        String str2 = scanner.nextLine();

        JOptionPane.showMessageDialog(null,"------String-----");
        JOptionPane.showInputDialog(null,str1);
        JOptionPane.showMessageDialog(null,str2);
    }
}

class HW10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Enter the three numbers: ");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter third number: "));


        if ((num1 == num2) && (num1== num2) && (num2==num3)) {
            JOptionPane.showMessageDialog(null,"All are equal");
        }else if ((num1 == num2) || (num1== num2) || (num2==num3)) {
            JOptionPane.showMessageDialog(null,"2 numbers are equal");
        }else {
            JOptionPane.showMessageDialog(null,"Numbers are not  equal");
    }
}

class HW11{
    public static void main(String[] args) {

        float a,b;
        Scanner scanner = new Scanner(System.in);
        a = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter value for a: "));

        b = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter value for b: "));


        if ((a<50) && (a<b)){
            JOptionPane.showMessageDialog(null,"The condition a<50 and a<b are true");
        }else {
            JOptionPane.showMessageDialog(null,"The condition a<50 and a<b are false");
        }
    }
}

class HW12{
    public static void main(String[] args) {
        float eng, math, sci, com;
        double total,percentage;
        Scanner op=new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Enter three marks of Robert:");
        eng = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter marks of English:"));
        math= Float.parseFloat(JOptionPane.showInputDialog(null,"Enter marks of Maths:"));
        com= Float.parseFloat(JOptionPane.showInputDialog(null,"Enter marks of Computer:"));


        total = eng + math+ com;
        percentage = (total / 300.0) * 100;

        JOptionPane.showMessageDialog(null,"The total marks obtained Roberts in three subjects is: "+percentage+"%");


    }
}

class HW13{
    public static void main(String[] args) {
        float eng, math, sci, com;
        double total,percentage;
        Scanner op=new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Enter three marks of Robert:");
        eng= Float.parseFloat(JOptionPane.showInputDialog(null,"Enter marks of English:"));


        total = eng + math+ com;
       percentage = (total / 300.0) * 100;
       JOptionPane.showMessageDialog(null,"The total marks obtained Roberts in three subjects is: "+percentage+"%");
    }
}