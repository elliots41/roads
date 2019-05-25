package roads;

public class Settlement {
	private String name;
	private int population;
	private SettlementType kind;
	private Road[] roads;
	private int numRoads;
	final int MAX_ROADS = 100; 
	/** max roads is the highest number of roads a settlement can have */
	
	public void setName(String newName) {
		name = newName;
	}

	public void setPopulation(int newPopulation) {
		population = newPopulation;
	}
	
	public void setKind(SettlementType newKind) {
		kind = newKind;
	}
	
	public void setRoad(Road[] newRoad) {
		roads = newRoad;
	}
	
	public void setNumRoads(int newNumRoads) {
		numRoads = newNumRoads;
	}
	

	public String getName() {
		return name;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public SettlementType getKind() {
		return kind;
	}
	
	public Road[] getRoads() {
		return roads;
	}
	
	public int getNumRoads() {
		return numRoads;
	}
	
	public Settlement(String nm, SettlementType k){
		   name = nm;
		   kind = k;
		   roads = new Road[MAX_ROADS];
		}

	public void add(Road road){
		if (numRoads < MAX_ROADS){
			roads[numRoads] = road;
			numRoads++;
		}
		else{
			//should report error
		}
	}
	
	
	public String toString() {
		return "This settlement is called " + name + " its a  " +kind +" and has a population of  "+ population;
	}
	
	
	
	
	
	
	
}
