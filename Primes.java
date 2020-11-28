package labs;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        for(int n = 2; n<=100;n++){
            if (IsPrime(n)){
                System.out.println(n);
            }
        }
    }
    //that class checks that the number is prime, and if its it, returns true, else false.
    public static boolean IsPrime(int n){
        for(int i = 2; i<n ; i++){
         if(n%i == 0)
             return false;
        }
        return true;
    }
}
