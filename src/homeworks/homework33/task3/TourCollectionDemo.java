package homeworks.homework33.task3;

public class TourCollectionDemo {
    public static void main(String[] args) {
        TourCollection collection = new TourCollection(7);

        collection.addRequest("Request 1");
        collection.addRequest("Request 2");
        collection.addRequest("Request 3");
        collection.addRequest("Request 4");
        collection.addRequest("Request 5");
        collection.addRequest("Request 6");

        System.out.println(collection);

        collection.processRequest();
        System.out.println(collection);

        System.out.println("Array length: " + collection.getQueueSize());

    }
}
