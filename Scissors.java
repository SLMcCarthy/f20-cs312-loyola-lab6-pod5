/* Scissors class: holds scissors choice
 * CS312 Lab 6
 * @authors Shane McCarthy, Joseph Carnovale
 * @version 1.0 10/13/20
 */


public abstract class Scissors extends Choice
{
      
      public String beats(Choice x)
      {
	      return "Scissors beats " +  x.toString();
      }

      public String toString()
      {
	      return "Scissors";
      }
}