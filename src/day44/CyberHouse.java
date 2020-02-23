package day44;

public class CyberHouse {
    int houseNum;
    String design;
    static String neighbourhoodName = "Cybertek Ave";

    public CyberHouse(int houseNum, String design) {
        this.houseNum = houseNum;
        this.design = design;
    }

    public void showAllInfo(){
        System.out.println(houseNum + " | " + design + " | " + neighbourhoodName);
    }

    public static void showNeighbourhood(){
        System.out.println("Neighbourhood name: " + neighbourhoodName);
    }

    public String toString() {
        return "CyberHouse{" +
                "houseNum=" + houseNum +
                ", design='" + design + '\'' + ", neighbhourhood=" + neighbourhoodName+
                '}';
    }
}
