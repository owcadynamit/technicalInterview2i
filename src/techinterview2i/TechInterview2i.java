/*
* Technical interview for post Junior Tester for 2i
 * Task: provide code that iterates in multiples of A until X, then in multiples of A + 1 until 2X, then multiples of A + 2 until 3X.
 * Date: 21/04/2022
 * Assumptions:
 *1. The solution is totally up to me and there is no requirement regarding the design. It will be programmed using Java Script using NetBeans. 
 *2. As the task should be completed in 30 minutes it is understandable to use a command line rather than any interface tool
 *3. As no specification was given, I took a freedom to create a space requesting a user input rather than array of values or hardcoded numbers. 
 *4. I assume the program is to work on positive integers rather than doubles and negative numbers.
 * 
*/
package techinterview2i;

import java.util.Scanner;

/**
 *
 * @author Justyna Konowrocka 
 */
public class TechInterview2i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the objects from user:
  Scanner in = new Scanner(System.in);
  System.out.println("The program iterates in multiples of A until X, then in multiples of A + 1 until 2X, then multiples of A + 2 until 3X. Give start values for A and X ");
  System.out.println("Input value for X: ");
  int X = in.nextInt();
   
  System.out.println("Input value for A: ");
  int A = in.nextInt();

    for (int i = A; i <= 3*X; i=A+i) { // generating for loop and "brackets" within which the program will work
            if (i <= X) { //first contition X=X
                System.out.printf("\n%d: Multiplies of A until X",i);//no increment
            } else if ( i+A> X && i < 2*X) {//second condition X=X*2
                i++;//increment by 1 - ++
                System.out.printf("\n%d: Multiplies of A +1 until 2 x X",i);
            } else if (i<3*X ) {//third condition X=X*3
                i+=2;//increment by 2 - +=2
                System.out.printf("\n%d: Multiplies of A +2 until 3 x X",i);
            } 
            }
  }
}


/*
*Conclusions and future imporvements:
*1. Obviously more details of specification are required to improve the application but for startes specifing where the values of A and X come from?
*2. More conditions regarding the input can be created. 
*/