/* Rock class: holds a rock object
 * CS312 Lab 06
 * @authors Joseph Carnovale, Shane McCarthy
 * @Version 1.0 10/13/20
 */

public abstract class Rock extends Choice
{
	public String beats(Choice x)
	{
		return "Rock beats " + x.toString();
	}

	public String toString()
	{
		return "Rock";
	}
}
