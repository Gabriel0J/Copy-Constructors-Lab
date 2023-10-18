public class Building {
    private String nameOfBuilding;
    private int numberOfWindows;
    private String ownerName;

    public Building(String nameOfBuilding, int numberOfWindows, String ownerName) {
        this.nameOfBuilding = nameOfBuilding;
        this.numberOfWindows = numberOfWindows;
        this.ownerName = ownerName;
    }

    public Building() {
        this("Unknown",0,"Unknown");
    }

    public Building(Building other) {
        this(other.nameOfBuilding,other.numberOfWindows,other.ownerName);
    }
    public String getNameOfBuilding() {
        return nameOfBuilding;
    }

    public void setNameOfBuilding(String nameOfBuilding) {
        this.nameOfBuilding = nameOfBuilding;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public boolean equals(Building other) {
        return (this.nameOfBuilding.equals(other.nameOfBuilding) && this.numberOfWindows == other.numberOfWindows && this.ownerName.equals(other.ownerName));
    }
    @Override public String toString() {
        return "Building Name: " + nameOfBuilding + ", Number of Windows: " + numberOfWindows + ", Owner Name: " + ownerName;
    }
    @Override public int hashCode() {
        return nameOfBuilding.hashCode();
    }
}
