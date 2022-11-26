public class Main {


    public static  void main(String[] args) {
        add(1, 5, 2);
        Car car = new Car();

        car.setDoors();
        car.setDoors();
        car.setDoors();

        System.out.println(car.doors);




    }

    // function for add 3 numbers
    private static void add(int num1, int num2, int num3){
        System.out.println(num1 + num2 + num3);
    }


    // custom class

    public static class Car {
        public int doors = 0;

        public void setDoors() {
            this.doors ++;
        }
    }
}