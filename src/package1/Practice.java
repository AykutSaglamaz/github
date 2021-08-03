package package1;

public class Practice {
    public static void main(String[] args) {


    //Fibonacci numbers/method
//     int a = 1;
//     int b = 1;
//     int c;
//     for (int i =0; i<10; i++){
//         c=a+b;
//         a=b;
//         b=c;
//         System.out.println(c);
//

         int fib [] = new int [10];
         fib[0]=1;
         fib[1]=1;
         for (int i = 0; i<8;i++) {
             fib[i + 2] = fib[i + 1] + fib[i];
             System.out.print(fib[i]+ " ");
         }
           /*
           for (int i = 2; i<10;i++){
           fib[i]= fib[i-1]+ fib[i-2];
            */

    }

    }


