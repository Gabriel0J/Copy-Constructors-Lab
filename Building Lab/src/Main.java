// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Building blank = new Building();
        Building building = new Building("building",10,"Tom");
        Building copy = new Building(building);
        System.out.println("Blank:      " + blank);
        System.out.println("Building:   " + building);
        System.out.println("Copy:       " + copy);
        System.out.println("Building == Blank: " + building.equals(blank));
        System.out.println("Building == Copy: " + building.equals(copy));
        System.out.println("Building HashCode: " + building.hashCode());
    }
}