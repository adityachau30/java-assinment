import java.util.Scanner;

// print numbers from 1 to 10
public class JavaHw {
    public static void main(String[] args) {
        int i =1;
        for( i = 1; i>=10; i++);
        System.out.println(i);
    }
}

// even number between 10 and 30
class Two{
    public static void main(String[] args) {
        int i =10;
        for( i =10; i<=30 & i<=30; i++){
            if(i%2==0){
                System.out.println(i);
            }

        }

    }
}
// display the number of even numbers between 10 and 30
class yhree{
    public static void main(String[] args) {
        int count = 0;
        int i =11;
        for(i=11; i<=30 & i<=30;i++){
            if(i%2==0){
               count = count + 1;
            }

        }
        System.out.println(count);
    }

}
// display no. of even and no. of odd number between 10 and 30
class pop{
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int i = 11;
        for(i=11; i<=30;i++){
            if(i%2==0){
                count1 = count1 +1;
            }
            else if(i%2!=0){
                count2 = count2 +1;
            }
        }
        System.out.println("The no. of even number between 10 and 30 is "+count1);
        System.out.println("The no. of odd number between 10 and 30 is "+count2);
    }
}
//  display multiplication table of a given no
class op{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number for multiplication: ");
        int tube = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(tube + " * " + i + " = " + tube * i);
        }
    }
}
// calculate the sum of first 10 natural number
class top{
    public static void main(String[] args) {
        int i = 1;
        int sum =0;
        for( i =1; i<=10;i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
// takes user input of any positive integer and print multiplication of that given number
class shop{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number for multiplication: ");
        int tube = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(tube + " * " + i + " = " + tube * i);
        }
    }
}
// the factorial value of any number entered through the keyboard
class fact{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int i= 1;
        int fact = 1;
        int number = scan.nextInt();
            for(i=1;i<=number;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of "+number+" is: "+fact);
        }
        }
 }
}

//Two numbers are entered through the keyboard. Write a program to find the value
//of one number raised to the power of another. (Do not use Java built-in method)
class Ques9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //For loop
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter exponent: ");
        int pow = input.nextInt();

        int result = 1;
        for (int i = 0; i < pow; i++) {
            result = result * num;
        }
        System.out.println("Result: " + result);

    }
}

//Write a program that prompts the user to input an integer and then outputs the
//number with the digits reversed. For example, if the input is 12345, the output
//should be 54321.
class Ques10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int digit;
        int i;
        int rev=0;
        i=num;
        rev=0;
        do {
            digit = i % 10;
            rev = rev * 10 + digit;
            i/=10;
        } while (i>0);
        System.out.println(rev);

    }
}



