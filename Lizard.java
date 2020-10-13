/* Lizard class: holds a lizard object
 * CS312 Lab 6
 * @authors Shane McCarthy, Joseph Carnovale
 * @version 1.0 10/13/20
 */


public abstract  class Lizard extends Choice
{
      
      public String beats(Choice x)
      {
	      return "Lizard beats " +  x.toString();
      }

      public String toString()
      {
	      return "Lizard";
      }
}
