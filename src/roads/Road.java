package roads;

public class Road {
	private String name;
	private Classification classification;
	private Settlement sourceSettlement;
	private Settlement destinationSettlement;

	public void setName(String newName) {
		name = newName;
	}

	public void setClasification(Classification newClassification) {
		classification = newClassification;
	}

	public void setSourceSettlement(Settlement newSourceSettlement) {
		sourceSettlement = newSourceSettlement;
	}

	public void setDestinationSettlement(Settlement newDestinationSettlement) {
		destinationSettlement = newDestinationSettlement;
	}

	public String getName() {
		return name;
	}

	public Classification getClassification() {
		return classification;
	}

	public Settlement getSourceSettlement() {
		return sourceSettlement;
	}

	public Settlement getDestinationSettlement() {
		return destinationSettlement;
	}

	public String toString() {
		return "Road [name=" + name + ", classification=" + classification
				+ ", sourceSettlement=" + sourceSettlement.getName()
				+ ", destinationSettlement=" + destinationSettlement.getName()
				+ "]";
	}

	// road constructor
	public Road(String n, Classification c, Settlement source,
			Settlement destination) {
		name = n;
		classification = c;
		sourceSettlement = source;
		destinationSettlement = destination;
		source.add(this);
		destination.add(this);
	}

}
