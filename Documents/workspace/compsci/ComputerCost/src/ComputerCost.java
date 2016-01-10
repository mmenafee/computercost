import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Cost {

	public static void main(String[] args) {
	
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
		
		Double electricityCost;
		int wattHours = 0;
		int totalHours = 0;
		
		 HashMap hm = new HashMap();
	      // Put elements to the map
		  hm.put("Idaho", new Double(8.0));
		  hm.put("North Dakota", new Double(8.1));
		  hm.put("Washington", new Double(8.2));
	      hm.put("Arkansas", new Double(8.7));
	      hm.put("Utah", new Double(8.8));
	      hm.put("Louisiana", new Double(8.9));
	      hm.put("Wyoming", new Double(8.9));
	      hm.put("South Dakota", new Double(9.0));
	      hm.put("Nebraska", new Double(9.0));
	      hm.put("Kentucky", new Double(9.0));
	      hm.put("West Virginia", new Double(9.2));
	      hm.put("Oklahoma", new Double(9.2));
	      hm.put("Oregon", new Double(9.4));
	      hm.put("Montana", new Double(9.6));
	      hm.put("Missouri", new Double(9.7));
	      hm.put("Tennessee", new Double(9.8));
	      hm.put("Indiana", new Double(10.0));
	      hm.put("North Carolina", new Double(10.2));
	      hm.put("Mississippi", new Double(10.3));
	      hm.put("Iowa", new Double(10.5));
	      hm.put("Kansas", new Double(10.5));
	      hm.put("Virginia", new Double(10.5));
	      hm.put("New Mexico", new Double(10.7));
	      hm.put("Minnesota", new Double(10.9));
	      hm.put("South Carolina", new Double(11.0));
	      hm.put("Arizona", new Double(11.1));
	      hm.put("Georgia", new Double(11.1));
	      hm.put("Alabama", new Double(11.1));
	      hm.put("Colorado", new Double(11.2));
	      hm.put("Ohio", new Double(11.2));
	      hm.put("Texas", new Double(11.3));
	      hm.put("Illinois", new Double(11.7));
	      hm.put("Florida", new Double(11.7));
	      hm.put("Nevada", new Double(11.7));
	      hm.put("Michigan", new Double(13.0));
	      hm.put("Wisconsin", new Double(13.0));
	      hm.put("Pennsylvania", new Double(13.2));
	      hm.put("Maryland", new Double(13.7));
	      hm.put("DC", new Double(13.7));
	      hm.put("Deleware", new Double(13.7));
	      hm.put("Massachussetts", new Double(14.8));
	      hm.put("Rhode Island", new Double(14.9));
	      hm.put("California", new Double(15.2));
	      hm.put("Maine", new Double(15.5));
	      hm.put("Vermont", new Double(16.1));
	      hm.put("New Jersey", new Double(16.3));
	      hm.put("New Hampshire", new Double(16.5));
	      hm.put("Alaska", new Double(17.5));
	      hm.put("Connecticut", new Double(18.1));
	      hm.put("New York", new Double(18.1));
	      hm.put("Hawaii", new Double(33.2));
	      
	      
	      hm.put("15" , new Double(15.0));
	      hm.put("17" , new Double(18.0));
	      hm.put("19" , new Double(20.0));
	      hm.put("20" , new Double(24.0));
	      hm.put("21" , new Double(26.0));
	      hm.put("22" , new Double(30.0));
	      hm.put("24" , new Double(40.0));
	      hm.put("30" , new Double(50.0));
	      hm.put("32" , new Double(55.0));
	      hm.put("37" , new Double(60.0));
	      hm.put("42" , new Double(80.0));
	      hm.put("50" , new Double(100.0));
	      
		     HashMap screensizeDictionary = new HashMap();
		      screensizeDictionary.put("15" , new Double(15.0));
		      screensizeDictionary.put("17" , new Double(18.0));
		      screensizeDictionary.put("19" , new Double(20.0));
		      screensizeDictionary.put("20" , new Double(24.0));
		      screensizeDictionary.put("21" , new Double(26.0));
		      screensizeDictionary.put("22" , new Double(30.0));
		      screensizeDictionary.put("24" , new Double(40.0));
		      screensizeDictionary.put("30" , new Double(50.0));
		      screensizeDictionary.put("32" , new Double(55.0));
		      screensizeDictionary.put("37" , new Double(60.0));
		      screensizeDictionary.put("42" , new Double(80.0));
		      screensizeDictionary.put("50" , new Double(100.0));
		      
		      HashMap cpuDictionary = new HashMap();
		      cpuDictionary.put("Core i3" , new Double(64.0));
		      cpuDictionary.put("Core i5" , new Double(79.0));
		      cpuDictionary.put("Core i7" , new Double(86.0));
		      cpuDictionary.put("Core i7-E" , new Double(140.0));
		      cpuDictionary.put("AMD Low End CPU 2 cores" , new Double(80.0));
		      cpuDictionary.put("AMD Mid End CPU 4 cores" , new Double(95.0));
		      cpuDictionary.put("AMD High End CPU 8 cores" , new Double(110.0));
		      
		      HashMap ramDictionary = new HashMap();
		      ramDictionary.put("DDR1 RAM" , new Double(4.75));
		      ramDictionary.put("DDR2 RAM" , new Double(3.75));
		      ramDictionary.put("DDR3 RAM" , new Double(2.5));
		      
		      HashMap fanDictionary = new HashMap();
		      fanDictionary.put("80 mm Case Fan (2,000 RPM)", new Double(1.2));
		      fanDictionary.put("80 mm Case Fan (3,000 RPM)", new Double(2.7));
		      fanDictionary.put("120 mm Case Fan (1,200 RPM)", new Double(1.45));
		      fanDictionary.put("120 mm Case Fan (2,000 RPM)", new Double(4.8));
		      fanDictionary.put("140 mm Case Fan (1,000 RPM)", new Double(1.4));
		      fanDictionary.put("140 mm Case Fan (2,000 RPM)", new Double(5.1));
		      
		      HashMap dvdplayerDictionary = new HashMap();
		      dvdplayerDictionary.put("SATA DVD Drive", new Double(21.0));
		      dvdplayerDictionary.put("SATA Blu-ray Drive", new Double(27.5));
		      
		      HashMap batteryDictionary = new HashMap();
		      
		      HashMap videocardDictionary = new HashMap();
	      
	      // 
			String state = JOptionPane.showInputDialog(null, "What state do you live in?");
			Double elecRate = ((Double) hm.get(state)).doubleValue();
			
			JOptionPane.showMessageDialog(null, "Your elecricity rate is: " + hm.get(state));
		
	      int hoursDay = Integer.parseInt(JOptionPane.showInputDialog(null,"How many hours do you use your computer per day?"));
	      totalHours = hoursDay + totalHours;
	      
	      int yearsKeepingComputer = Integer.parseInt(JOptionPane.showInputDialog(null, "How many years do you plan to keep the computer? "));

			if(yearsKeepingComputer < 20){
				totalHours = hoursDay * 8760 * yearsKeepingComputer;
				JOptionPane.showMessageDialog(null, "You are spending " + totalHours + "hours on your computer in total");
			}
			else System.out.println("Too much time on computer");
	      
	      int computerPrice = Integer.parseInt(JOptionPane.showInputDialog( null, "What was the price of your computer? " ));
			JOptionPane.showMessageDialog(null, "Your computer Price is: " + computerPrice);
			
			Object[] deskLap = { "Desktop","Laptop"};
			int dl = JOptionPane.showOptionDialog( 
		     null                       // Center in window.
             ,  "Do you own a desktop or laptop?"        // Message
             , ""               // Title in titlebar
             , JOptionPane.YES_NO_OPTION  // Option type
             , JOptionPane.PLAIN_MESSAGE  // messageType
             , null                       // Icon (none)
             , deskLap                  // Button text as above.
             , "Cancel"    // Default button's label
           );
			 if(dl == JOptionPane.YES_OPTION){
				 wattHours = wattHours + 1000;
			 }
			 if(dl == JOptionPane.NO_OPTION){
				 wattHours = wattHours + 500;
			 }
			 
			 int screenSize = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the size of your screen"));
				
				if (screenSize == 15){
					JOptionPane.showMessageDialog(null, "Your screen uses " + screenSize + "watts of pwower");
				}
	      
	      Object[] brands = {"AMD","Intel"};
	      Object[] intel =  {"Core i7","Core i5","Core i3"};
	      Object[] amd = { "High End(8 cores)", "Mid End(4 Cores)", "Low End(2 Cores)"};
	      int brandOfCPU =JOptionPane.showOptionDialog(
	               null                       // Center in window.
                  , "What is the brand of your CPU?"        // Message
                  , ""               // Title in titlebar
                  , JOptionPane.YES_NO_OPTION  // Option type
                  , JOptionPane.PLAIN_MESSAGE  // messageType
                  , null                       // Icon (none)
                  , brands                  // Button text as above.
                  , "Cancel"    // Default button's label
                );
	      if(brandOfCPU == JOptionPane.YES_OPTION){
	    	  int cores =JOptionPane.showOptionDialog(
		               null                       // Center in window.
	                  , "Which model of AMD CPU do you have?"        // Message
	                  , ""               // Title in titlebar
	                  , JOptionPane.YES_NO_OPTION  // Option type
	                  , JOptionPane.PLAIN_MESSAGE  // messageType
	                  , null                       // Icon (none)
	                  , amd                  // Button text as above.
	                  , "Cancel"    // Default button's label
	                  );
	    	  if(cores == JOptionPane.NO_OPTION){
	    		  wattHours = wattHours + 80;
	    	  }
	    	  if(cores == JOptionPane.YES_OPTION){
	    		  wattHours = wattHours + 95;
	    	  }
	    	  if(cores ==JOptionPane.CANCEL_OPTION){
	    		  wattHours = wattHours + 110;
	    	}
	      if(brandOfCPU == JOptionPane.NO_OPTION){
	    	  int cored =JOptionPane.showOptionDialog(
		               null                       // Center in window.
	                  , "Which model of Intel CPU do you have?"        // Message
	                  , ""               // Title in titlebar
	                  , JOptionPane.YES_NO_OPTION  // Option type
	                  , JOptionPane.PLAIN_MESSAGE  // messageType
	                  , null                       // Icon (none)
	                  , intel                  // Button text as above.
	                  , "Cancel"    // Default button's label
	                  );
	    	  if(cored == JOptionPane.NO_OPTION){
	    		  wattHours = wattHours + 64;
	    	  }
	    	  if(cored == JOptionPane.YES_OPTION){
	    		  wattHours = wattHours + 84;
	    	  }
	    	  if(cored ==JOptionPane.CANCEL_OPTION){
	    		  wattHours = wattHours + 86;
	    	  }
	      }
	      	Object[] ramType = {"n DDR3 RAM","n DDR2","n DDR1 RAM"};
	      	
	      	int whichRAM = JOptionPane.showOptionDialog(
	      			   null                       // Center in window.
	                  , "Which model of Intel CPU do you have?"        // Message
	                  , ""               // Title in titlebar
	                  , JOptionPane.YES_NO_OPTION  // Option type
	                  , JOptionPane.PLAIN_MESSAGE  // messageType
	                  , null                       // Icon (none)
	                  , ramType                 // Button text as above.
	                  , "Cancel"    // Default button's label
	                  );
	      	if(whichRAM == JOptionPane.YES_OPTION){
	      		String sizeOfRAM = "DDR3 RAM";
	      		Double ramRate = ((Double) ramDictionary.get(sizeOfRAM)).doubleValue();
	      	}
	      	if(whichRAM == JOptionPane.NO_OPTION){
	      		String sizeOfRAM = "DDR2 RAM";
	      		Double ramRate = ((Double) ramDictionary.get(sizeOfRAM)).doubleValue();
	      	}
	      	if(whichRAM == JOptionPane.CANCEL_OPTION){
	      		String sizeOfRAM = "DDR1 RAM";
	      		Double ramRate = ((Double) ramDictionary.get(sizeOfRAM)).doubleValue();
	      	}
	      	
	      	
	    		  			
		String typeOfFan = JOptionPane.showInputDialog(null, "What type of fan do you have? ");
		String dvdPlayer = JOptionPane.showInputDialog(null, "What type of DVD player do you have? ");  
		
		


		int batteryType= Integer.parseInt(JOptionPane.showInputDialog(null, "What kind of battery do you have? "));
		int volts = 0;
		int amps = 0;
		
		
		int batteryCost = volts * amps;
		
		
		//add all the watts used, then multiply that by state price per hour, then multiply that by the number of hours
		//the user is planning to keep the computer
		
	}

}
}
