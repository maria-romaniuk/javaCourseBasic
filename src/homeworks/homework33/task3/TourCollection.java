package homeworks.homework33.task3;

import java.util.ArrayList;
import java.util.List;

public class TourCollection {
    private int maxSize;
    private List<String> list;

    public TourCollection( int maxSize) {
        this.maxSize = maxSize;
        this.list = new ArrayList<>(maxSize);
    }

    public void addRequest(String request){
        if (list.size() <= maxSize){
            list.add(request);
            System.out.println("Request "+ request + " added");
        } else {
            System.out.println("Request array is full");
        }
    }

    public void processRequest(){
        if (list.isEmpty()) {
            System.out.println("Your request list is empty");
        } else {
            String processedRequest = list.removeFirst();
            System.out.println("Request " + processedRequest + "is processed");
        }
    }

    public int getQueueSize(){
        return list.size();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<String> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "TourCollection{" +
                "maxSize=" + maxSize +
                ", list=" + list +
                '}';
    }
}
