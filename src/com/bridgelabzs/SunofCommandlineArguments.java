package com.bridgelabzs;
public class SunofCommandlineArguments {

    public static void main(String args[]) {
      /*  int count=0, sum=0;
        int a;
        try {
            a = Integer.parseInt(args[0]);
            sum+=a;
        }catch (NumberFormatException e){
            count++;
            throw new RuntimeException(e);
        }
        String str1 = args[1];
        System.out.println("a:" +a);
        System.out.println("str1:" + str1);
    }
}

       */
        int sum = 0;
        System.out.println("Calculates Sum for below Integers");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            try {
                sum = sum + Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer command line arguments: " + e.toString());
            }
        }
        System.out.println("Sum :" + sum);

    }
}