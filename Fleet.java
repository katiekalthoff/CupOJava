package application.model;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fleet {
	
	//Declare class variables
	private String name;
	private ArrayList<Starship> ships = new ArrayList<Starship>();
	
	//Create an empty Fleet object
	public Fleet()
	{
		this.name = "";
		this.ships = new ArrayList<Starship>();
	}
	
	//Create a Fleet object populated with passed in values
	public Fleet(String n, ArrayList<Starship> vessels)
	{
		this.name = n;
		this.ships = vessels;
	}
	
	//Get a Fleet's name
	public String getFleetName()
	{
		return this.name;
	}
	
	//Get the number of Starships in a Fleet
	public int getFleetSize()
	{
		return this.ships.size();
	}
	
	//Set a Fleet's name
	public void setFleetName(String n)
	{
		this.name = n;
	}
	
	//Set a Fleet's list of ships
	public void setFleetShips(ArrayList<Starship> vessels)
	{
		this.ships = vessels;
	}
	
	//Add a new Starship object to the Fleet object
	public void addShip(Starship ship)
	{
		this.ships.add(ship);
	}
	
	//Parse through a string
	private String[] parse(String line)
	{
		return line.split(",");
	}
	
	//Read input from passed in data file
	public void readFleet(String inputFile) throws IOException
	{
		//Declare Variables
		String line;
		String[] separatedLine;
		
		//Read File
		File file = new File(inputFile);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		//Parse through file line-by-line and use data to populate a new Starship object
		while((line = bufferedReader.readLine()) != null)
		{
			separatedLine = parse(line);
			
			Starship newShip = new Starship();
			newShip.setStarshipName(separatedLine[0]);
			newShip.setStarshipRegistry(separatedLine[1]);
			newShip.setStarshipClass(separatedLine[2]);
			
			//Add Starship to the Fleet
			this.addShip(newShip);
		}
		bufferedReader.close();
	}
	
	//Read input from passed in data file
	public void readPersonnel(String inputFile) throws IOException
	{
		//Declare variables
		String line;
		String[] separatedLine;
		
		//Configure and read file
		File file = new File(inputFile);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		//Parse through file line-by-line and use data to populate new CrewMember object
		while((line = bufferedReader.readLine()) != null)
		{
			separatedLine = parse(line);
			
			CrewMember newCrew = new CrewMember();
			newCrew.setCrewName(separatedLine[0]);
			newCrew.setCrewPosition(separatedLine[1]);
			newCrew.setCrewRank(separatedLine[2]);
			newCrew.setCrewSR(separatedLine[3]);
			newCrew.setCrewSpecies(separatedLine[4]);
			
			//If CrewMember belongs to the correct ship, add to Starship
			for(int i=0; i<this.ships.size(); i++)
			{
				if(this.ships.get(i).getStarshipRegistry(this.ships.get(i)).equals(separatedLine[3]))
				{
					this.ships.get(i).addCrewMember(newCrew);
				}
			}
		}
		bufferedReader.close();
	}
	
	//Search through the Starships in the Fleet to find names matching
	public ArrayList<Starship> getStarshipsByName(String shipName)
	{
		//Declare new Starship ArrayList
		ArrayList<Starship> matchingShips = new ArrayList<Starship>();
		
		//String searchName = shipName; 
		for(int j=0; j<this.ships.size(); j++)
		{
			//Format string to search for (accounts for user not entering "USS ")
			String compareName = this.ships.get(j).getStarshipName(this.ships.get(j)).substring(4);
			
			//Compare strings
			if(compareName.equalsIgnoreCase(shipName))
			{
				matchingShips.add(this.ships.get(j));
			}
		}
		return matchingShips;
	}
}
