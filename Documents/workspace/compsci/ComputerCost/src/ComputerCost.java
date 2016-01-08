import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.util.Scanner;
import java.util.Arrays;

public class ComputerCost
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String cpu;
		String [] cpubrands = {"Intel", "AMD"};
		Scanner scan = new Scanner(System.in);
		
		System.out.println(Arrays.toString(cpubrands));
		System.out.println("Type one of these brands:");
		cpu =scan.nextLine();
		
		if(cpu == "Intel"){
			 String[] models = { "Core i3", "Core i5","Core i7" };
				JComboBox cpuModels = new JComboBox(models);
		}
	}

}
