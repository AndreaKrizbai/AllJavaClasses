package day40;

public class SpaceShip {
        String name;
        String currentDirection;
        int xCoordinate;
        int yCoordinate;

        public void setInitialPosition(int x, int y){
            xCoordinate = x;
            yCoordinate = y;
        }

         public void setDirection(String newDirection){
//             if (newDirection.equalsIgnoreCase("up") || newDirection.equalsIgnoreCase("down") ||
//                     newDirection.equalsIgnoreCase("right") || newDirection.equalsIgnoreCase("left")) {
                 currentDirection = newDirection;
//             } else {
//                 System.out.println("Invalid direction");
//                 currentDirection = "";
//             }
        }

//    public void move1Block() {
//        if (currentDirection.equals("right")) {
//            xCoordinate++;
//        } else if (currentDirection.equals("up")) {
//            yCoordinate++;
//        } else if (currentDirection.equals("left")) {
//            xCoordinate--;
//        } else if (currentDirection.equals("down")) {
//            yCoordinate--;
//        }
//    }
    public void move1Block() {
        switch (currentDirection) {
            case "right":
                xCoordinate += 1;
                break;
            case "left":
                xCoordinate -= 1;
                break;
            case "up":
                yCoordinate += 1;
                break;
            case "down":
                yCoordinate -= 1;
                break;
            default:
                break;
        }
    }

    public void move1Block(String newDirection){
            setDirection(newDirection);
            move1Block();
    }

    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }
}

