
/**
 * highestValFinder
 * This program should look through an array of numbers and find the highest value
 * Dan Joshwa
 */
import java.util.*;//import libgrary
public class highestValFinder
{
    public highestValFinder()//main
    {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int[] temps = {34, 32, 40, 50, 55, 70, 73, 75, 70, 65, 55, 40};//arrays    
        int highestVal = 0;//this int becomes the highest value in the int
        int highestMonth = 0;
        for (int i = 0; i < temps.length; i++)//traverses the temps array
        {
            //System.out.println(temps[i]);
            if (temps[i] > highestVal)//if the number read in the array is higher than the current highest value
            {
                highestVal = temps[i];//it becomes the highest value
                highestMonth = i;//and we record the address
            }
        }
        System.out.println(months[highestMonth] + " - " + highestVal);//so we can print the month and temp
    }
}
