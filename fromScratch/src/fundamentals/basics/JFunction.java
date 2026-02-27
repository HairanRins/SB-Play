  
            /* JAVA FUNCTIONS */

import java.util.*;
public class JFunction{
    
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("I'm NAVLOK Device 07");
    }

    public static int calculatesum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a,b); //here the varible sum is diffent from the above one coz its stored in another function.
        printHelloWorld();
    }
}


/* CALL BY VALUE */

/* PRODUCT OF TWO NOS */

// public class JFunction{
    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }

    public static void main(String args[]){
        int x = 5;
        int y = 4;
        int product = multiply(x,y);
        System.out.print("The product = " + product);
    }
// }   

/* FACTORIAL OF N */
// import java.util.*;
// public class JFunction{
    
    public static int factorial(int n){
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Wanna know the factorial? \n Enter your no here : ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("The factorial is " + fact);
    }

// }

// public class JFunction{
    
    public static int factorial(int n){
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact = fact * i;
        } 
        return fact;
    }
    public static int bincoff(int n, int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int n_rfact = factorial(n-r);
        int bincoff = nfact / (rfact * n_rfact);
        return bincoff;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Wanna Calculate Binomial Co-efficient? \nProvide following values: \nThe value of n = ");
        int n = sc.nextInt();
        System.out.print("The value of r = ");
        int r = sc.nextInt();
        int bincoff = bincoff(n,r);
        System.out.print("The Binomial Co-efficient is : " + bincoff);    
        }
}

            /* FUNCTIONAL OVERLOADING 

                Diff No of Parameters*/

public class JFunction{
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum( int a , int b , int c){
        return a+b+c;
    }

    public static void main(String args[]){
       int s1 = sum(3,5);
       int s2 = sum(3,5,7);
       System.out.println(s1+  " " + s2 );
       System.out.print(s2);

    }
}       
        //    Different type

public class JFunction{
    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String args[]){
        System.out.println(sum(4,8));
        System.out.print(sum(4.2f,8.6f));
    }
}

        /* IS PRIME NORMAL & OPTIMISED CASE */

/* NORMAL */

public class JFunction{
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }

        for (int i=2; i<=n-1; i++){
            if (n%i==0){
                return false;
            }

        }
        return true;
    }

    public static void main(String args[]){
        System.out.print(isPrime(1));
    }   

}

/* OPTIMISED */

//import java.math.*;
public class JFunction{
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }

        for (int i=2; i<=(Math.sqrt(n)); i++){
            if (n%i==0){
                return false;
            }
       
        }
        return true;
    }

    public static void main(String args[] ){
        System.out.print(isPrime(7));
    }
}


//import java.Scanner;
public class JFunction{
    
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }    
        }
        return true;
    }
    
    public static int primeInRange(int n){
        for (int i=2; i<=n; i++){
            if (isPrime(i)==true){
                System.out.print(i + " ");
            }
        } 
        return n;
    }

    public static void main(String args[]){
        primeInRange(100);
    }
}
        /* Binary to Decimal*/

public class JFunction{
    public  static int binaryToDecimal(int  binNum){
        int myNum = binNum;
        int pow = 0;
        int dec = 0;

        while (binNum>0){
            int lastDigit = binNum % 10;
            dec += lastDigit * (int)Math.pow(2,pow); 
            pow++;
            binNum /= 10; 
        }
        
        System.out.println("Decimal value of " + myNum + " = " + dec );
        return dec;
    }
    public static void main(String args[]){
        binaryToDecimal(1111);
    }
}*/

    /* Decimal To Binary */

// public class JFunction{
    public static int decimalToBinary(int n){
        int pow = 0;
        int myNum = n;
        int binNum = 0;

        while (n>0){
            int rem = n % 2;
            binNum += rem * Math.pow(10,pow);
            pow++;
            n/=2;
        }
        System.out.print("The Binary for " + myNum + " in " + binNum);
        return binNum;    
    }

    // public static void main(String args[]){
    //     decimalToBinary(5);
    // }
// }