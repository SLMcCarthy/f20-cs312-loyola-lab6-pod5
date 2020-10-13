/* Spock class: holds a spock choice
 * CS312 Lab 6
 * @authors Shane McCarthy, Joseph Carnovale
 * @version 1.0 10/13/20
 */


public abstract  class Spock extends Choice
{
      
      public String beats(Choice x)
      {
	      return "Spock beats " +  x.toString();
      }

      public String toString()
      {
	      return "Spock";
      }
}
