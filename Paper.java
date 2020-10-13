/* Paper class: holds a paper object
 * CS312 Lab 06
 * @authors Joseph Carnovale, Shane McCarthy
 * @Version 1.0 10/13/20
 */

public abstract class Paper extends Choice
{
	public String beats(Choice x)
	{
		return "Paper beats " + x.toString();
	}

	public String toString()
	{
		return "Paper";
	}
}
