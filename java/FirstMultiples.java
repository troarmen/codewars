/*
Implement a function that takes two numbers m and n and returns an array of the first m multiples of the real number n. Assume that m is a positive integer.

Ex.
(3, 5.0) --> [5.0, 10.0, 15.0]
 */

public class FirstMultiples {
    public static int[] multiples(int m, int n) {
      int[] numeros = new int[m];
      for(int i = 0; i < m; i++){
        numeros[i] = n * (i + 1);
      }
      
      return numeros;
    }
  }