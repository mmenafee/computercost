import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

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

public class electricityUse {

	public static void main(String[] args) {
	
		//System.out.println("How many hours do you use your computer per day?");
		//System.out.println("Screen Size?");
		//int screenSize;
		//System.out.println("Type of CPU?");
		//int typeOfCPU;
		//System.out.println("Size of RAM?");
		//int sizeOfRAM;
		//System.out.println("Type of Fan?");
		//boolean typeOfFan;
		//System.out.println("Type of DVD player?");
		//boolean dvdPlayer;
		//System.out.println("What type of battery do you have?");
		//int batteryType;
		//int volts = 0;
		//int amps = 0;
		//int batteryLength = volts * amps;
		
		 HashMap hm = new HashMap();
	      // Put elements to the map
	      hm.put("Alabama", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      hm.put("Alabama", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      hm.put("Alabama", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      hm.put("Alabama", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      hm.put("Alabama", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      hm.put("Alabama", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      hm.put("Alabama", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      hm.put("Alabama", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      hm.put("Alabama", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      hm.put("Alabama", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      
		int computerPrice = Integer.parseInt(JOptionPane.showInputDialog( null, "What is your computer Price: " ));
		JOptionPane.showMessageDialog(null, "Your computer Price is: " + computerPrice);
		
		//String dl = JOptionPane.showInputDialog(null, "Do you own a desktop or laptop?");
		//JOptionPane.showMessageDialog(null);
		int alaskaAlabamaArkansas = 8;
		//System.out.println("Desktop or Laptop?");
		//String desktopOrLaptop;
		//desktopOrLaptop = user_input.next();
		
		
		//String state = JOptionPane.showInputDialog(null, "What state do you live in?");
		//if (state.contains("Alabama")) {
			//String state = Integer.toString(alaskaAlabamaArkansas);
		//}
		
		
		
		int hoursPerDay = Integer.parseInt(JOptionPane.showInputDialog(null, "How many hours do you spend on your computer per day? "));
		int screenSize = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the size of your screen"));
		int typeOfCPU = Integer.parseInt(JOptionPane.showInputDialog(null, "What type of CPU do you have? "));
		int sizeOfRAM = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the size of your RAM"));
		String typeOfFan = JOptionPane.showInputDialog(null, "What type of fan do you have? ");
		String dvdPlayer = JOptionPane.showInputDialog(null, "What type of DVD player do you have? ");
		int batteryType= Integer.parseInt(JOptionPane.showInputDialog(null, "What kind of battery do you have? "));
		int volts = 0;
		int amps = 0;
		int electricityCost;
		
		int batteryCost = volts * amps;
		
		
		//add all the watts used, then multiply that by state price per hour, then multiply that by the number of hours
		//the user is planning to keep the computer
		
	}

}
