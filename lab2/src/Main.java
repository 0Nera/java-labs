public class Main {
    public static void main(String[] args) {
        Car car_one= new Car("BWM", "10200", "Red", 2000);
        Car car_two = new Car();
        Car car_three = new Car("Red", 2000);
        System.out.println(car_one);
        System.out.println(car_two);
        System.out.println(car_three);
        car_two.set_color("yellow");

        int current_year = 2024;
        System.out.println(car_one.get_diff_year(current_year));
    }
}

