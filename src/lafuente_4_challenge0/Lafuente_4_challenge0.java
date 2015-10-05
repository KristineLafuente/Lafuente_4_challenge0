/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lafuente_4_challenge0;

/**
 *
 * @author Kristine
 */
public class Lafuente_4_challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int somenumber;
        for (somenumber = 0; somenumber < 100; somenumber++) {
            if (isDivisibleByFiftyFive(somenumber)) {
                System.out.println(somenumber + "Animate this");
            } else if (isDivisibleByTwentyTwo(somenumber)) {

                System.out.println(somenumber + "ninja");
            } else if (isDivisibleByThirtyThree(somenumber)) {
            
            System.out.println(somenumber + "Herr Direktor");  
            } else if (isDivisibleByFive(somenumber)){
                      
             System.out.println(somenumber + "Vidal");
            } else if (isDivisibleByThree(somenumber)){
                System.out.println(somenumber + "Claughton");
                
            } else if (isDivisibleByTwo(somenumber)){
                System.out.println(somenumber + "Davis");
               
            }  else if (isDivisibleByThree(somenumber) & isDivisibleByTwo(somenumber)){
                System.out.println(somenumber + "chisme");
                
            } else if (isDivisibleByThree(somenumber) & isDivisibleByFive(somenumber)){
                System.out.println(somenumber + "Old School");
                
            } else if (isDivisibleByTwo(somenumber) & isDivisibleByThree(somenumber) & isDivisibleByFive(somenumber)){
  }                System.out.println(somenumber + "Team Building");
        }
        // TODO code application logic here
    }

    static boolean isDivisibleByTwo(int D) {
        return (D % 2 == 0);

    }

    static boolean isDivisibleByTwentyTwo(int N) {
        return (N % 22 == 0);
    }

    static boolean isDivisibleByThree(int C) {
        return (C % 3 == 0);
    }

    static boolean isDivisibleByThirtyThree(int H) {
        return (H % 33 == 0);
    }

    static boolean isDivisibleByFive(int V) {
        return (V % 5 == 0);
    }

    static boolean isDivisibleByFiftyFive(int A) {
        return (A % 55 == 0);
    }

        
    }


