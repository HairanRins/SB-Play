 
 /* LOOPS */

import java.util.*;
public class JavaLoops{
    public static void main(String args[]){
        int counter = 0;
        while (counter < 3){
            System.out.println("Navnitya is a Software Developer");
            counter++;
        }

//     }
// }

/* Print no 1 to 10 */

// public class JavaLoops{
//     public static void main(String args[]){
        int counter1 = 1;
        while (counter1 <=10000){
            System.out.print(counter1+" ");
            counter1++;
        }  
//     }
// }


// public class JavaLoops{
    // public static void main(String args[]){
        System.out.print("Enter tha range of nos : ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        while (counter <= range){
            System.out.print(counter + " ");
            counter++;
        }
//     }
// }

/* SUM OF FIRST N NATUTAL NOS. */

// import java.util.*;
// public class JavaLoops{
//     public static void main(String args[]){
        
        System.out.print("Enter teh range of natural nos to be added: ");
        
        // Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int i = 1;

        while (i <= n ){
            sum = sum +i;
            i++;
            
        }    
        System.out.print(sum);

//     }
// }*/

/* FOR LOOP */

// public class JavaLoops{
    // public static void main(String args[]){
        for (int i = 1; i <= 4; i++ ){
            System.out.println("Im Navnitya Vinayak");
        }
//     }
// }

// public class JavaLoops{
//     public static void main(String args[]){
        for (int line = 1; line<=4; line++){
        System.out.println("****");
        }

//     }
// }

//10899 10000+800+90+9
//V-I-P-O
// import java.util.*;
// public class JavaLoops{
//     public static void main(String args[]){
    System.out.print("Enter a number : ");
    // Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

     while (n>0){
        int r = n%10;
        System.out.print(r+"");
        n=n/10;
     
        } 
//     }    
// }

// import java.util.*;
// public class JavaLoops{
//     public static void main(String args[]){
    System.out.print("Enter a number : ");
    // Scanner sc = new Scanner(System.in);
    int ni = sc.nextInt();
    int rev = 0;
     while (ni > 0){
        int r = n % 10;
        rev = rev * 10 + r;
        n = n / 10;
     
        }
    System.out.print(rev); 
//     }    
// }*/

/* break */

/* Keep entering a number till user enters number multiple of */

// import java.util.*;
// public class JavaLoops{
//     public static void main(String args[]){
       
        System.out.print("Enter any no. other tha nmultiple of 10 : ");
       
        // Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       
        while(true){
        System.out.print("Enter any no. other tha nmultiple of 10 : ");
        int num = sc.nextInt();
        System.out.print(num);
            if (num % 10 == 0){
                break;
            }
        
        }
        
    }
}

/* CONTINUE STATEMENT */

// public class JavaLoops{
//     public static void main(String args[]){
        for (int i = 1; i <= 5;i++){ 
            if (i==3){
                continue;
            }
        System.out.print(i + " ");
        }
//     }
// }

/* Keep entering numbers till user enters number multiple of */

// import java.util.*;
// public class JavaLoops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("ENter a num: ");
            int num = sc.nextInt();
            if (num % 10==0){
                continue;
            }
        System.out.println(num);
        }
//     }
// }*/


/* CHECK IF A NO IS PRIME */
// import java.util.*;
// public class JavaLoops{
//     public static void main(String args[]){
        
        System.out.print("Enter a num : ");
        
        // Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;

        for (int i=2 ; i<=n-1 ; i++){
            if (n % i == 0){ // n is a multiple of i (i is not equal to 1 or n)
                isPrime = false;
            }
        }
        if (isPrime == true){
            System.out.println("It is Prime no.");

        }
        else{
            System.out.println("The no is not prime");
        }
//     }
// }

public class JavaLoops{
    public static void main(String[]args){
        for ( int i = 0 ; i<5 ; i++) {
        System.out.println("Hello");
        i+=2;
        }
    }
}*/

/*Question2:
Write a program that reads a set of itegers, and then prints the sum of the
even and odd integers. */

import java.util.*;
public class JavaLoops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        
        do{ 
            System.out.print("Enter a no.: ");
            num = sc.nextInt();

            if (num % 2 == 0){
                evenSum += num;
            }
            else {
                oddSum += num;

            }
            System.out.println("Do you want to continue? press 1 if YES or press 0 if NO.");
            choice = sc.nextInt();
        }
        while (choice == 1);
            System.out.println("Even Sum : " + evenSum);
            System.out.println("Odd Sum : " + oddSum);
        
    }
}

// FACTORIAL OF A NUMBER

import java.util.*;
public class JavaLoops{ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int n = sc.nextInt();
        int factN = 1;
        for (int i=1 ; i<=n ; i++){
        factN = factN*(i);
        }
        System.out.println("Factorial of the no is : " + factN);

    }
}
import java.util.Scanner;
public class JavaLoops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural no: ");
        int n = sc.nextInt();
        int table = n;
        System.out.println("The required table is: ");
        for(int i=1 ; i<=10 ; i++){
            table = n*i;
            System.out.println(n + " * " + i + " = " + table );
        }
        
    }
}*/

/* NESTED LOOPS PATTURN I 

        *
        **
        ***
        *****/

public class JavaLoops{
    public static void main(String args[]){
        for (int line=1; line<=10; line++){
            for (int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println(); //next line
        }
    }
    
}

/*     ****
        ***
        **
        *
    */    
public class JavaLoops{
    public static void main(String args[]){
      for(int line=1; line<=10; line ++){
        for (int star=10; star>=line; star--){
            System.out.print("*");

        }
        System.out.println();
      }  
    }
}
/* ANOTHER MEATHOD */

public class JavaLoops{
    public static void main(String args[]){
        int n = 22;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
        A
        BC
        DEF
        GHIJ
*/
// public class JavaLoops{
//     public static void main(String args[]){
        int nq = 4;
        char ch = 'A';
        for (int i = 1; i<=nq; i++){
            for (int j = 1; j<=i ; j++){
                System.out.print(ch);
                ch++;
            }
        System.out.println();
        }
    // } 
// }       
/*
        1
        12
        123
        1234
*/
// public class JavaLoops{
//     public static void main(String args[]){
        int n = 10;
       // int num = 1;
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
               // for(num=1; num<=i; num++){

                
                //num++;
            }
        System.out.println();
        }
//     }
// }
/*
        ****
        *  *
        *  *
        ****
*/
// public class JavaLoops{
//     public static void main(String args[]){
      int n = 4;
        for (int i = 1; i <= n; i++) {
            if (i == 2 || i == 3) {
                System.out.print("*     *");
            } else {
                    System.out.print("* * * *");
                
            }
            System.out.println("");
        }
//     }
// }
