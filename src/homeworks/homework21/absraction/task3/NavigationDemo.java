package homeworks.homework21.absraction.task3;

public class NavigationDemo {
    public static void main(String[] args) {
        CarNavigationSystem car = new CarNavigationSystem();
        MarineNavigationSystem boat = new MarineNavigationSystem();

        car.startNavigation();
        car.stopNavigation();

        boat.startNavigation();
        boat.stopNavigation();
    }
}
