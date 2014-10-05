//Writen by Adam Kafka in CSE002
//This program makes an array of random numbers, then sorts it doubleo two different arrays of even and odd

import java.util.Scanner;

public class CollatzCalculate{//defines the program
     public static void main (String[] args){//defines the main method
          int limit=1000;
          int input=0; //Alows me to say results[input][x]
          int output=1; ////Alows me to say results[output][x]
          double[][] results = new double[2][limit];
          
	  //System.out.println("+------------------+---------------+");//begin table
          //System.out.println("|     input        |      steps    |");
          //System.out.println("+------------------+---------------+");
          results[input][0]=0;
          results[output][0]=0;
          for(int x=1; x<limit; x++){
               results[input][x]=x;
               results[output][x]=steps(x);
               System.out.println(results[input][x]+"\t"+results[output][x]);
	       //System.out.println("| "+results[input][x]+" \t | "+results[output][x]+" \t |");
          }
          //System.out.println("+------------------+---------------+");
          max(results);
          //System.out.println("+------------------+---------------+");
          
	  //Below is just try one number
          //double in=10000000000.0;
          //System.out.println("Input = "+in);
          //System.out.println("Steps = "+steps(in));
     }
     
     public static void max (double[][] A){//store which number in [0] and steps in [1]
          int input=0; //Alows me to say results[input][x]
          int output=1; ////Alows me to say results[output][x]
          double maxNumber=A[input][1];
          double maxSteps=A[output][1];
          for(int x=2; x<A[input].length; x++){
               if(A[output][x]>maxSteps){
                    maxNumber=A[input][x];
                    maxSteps=A[output][x];
               }
          }
          System.out.println(maxNumber+"\t"+maxSteps);
	  //System.out.println("| "+maxNumber+" \t | "+maxSteps+" \t |");
     }
     
     public static int steps (double input){
          int steps=0;
          while(input!=1){
               input=calculate(input);
               steps++;
          }
          return steps;
     }
     
     public static double calculate (double input){
          if(input%2==0){//even
               input/=2;
          }
          else{//input is odd
               input=(input*3)+1;
          }
          return input;
     }
     
}//end of class
