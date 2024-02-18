package homeworks.homework21.absraction.task3;

public class CarNavigationSystem extends NavigationSystem{
    @Override
    void startNavigation() {
        System.out.println("CarNavigation started. ");
    }

    @Override
    void stopNavigation() {
        System.out.println("CarNavigation stopped.");
    }
}
