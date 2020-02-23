package day44;

public class CyberHouseAction {
    public static void main(String[] args) {

        CyberHouse.showNeighbourhood();
        CyberHouse c1 = new CyberHouse(59,"Victorian");
        System.out.println("c1 = " + c1);
        c1.neighbourhoodName = "Rockville";
        CyberHouse.showNeighbourhood();
        System.out.println(c1);
        c1.showAllInfo();

        CyberHouse c2 = new CyberHouse (102, "Classic");
        c2.showAllInfo();

        System.out.println(CyberHouse.neighbourhoodName);
        System.out.println(c2.houseNum);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);


    }
}
