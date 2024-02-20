package lessons.lesson26.TVArrayList;

public class TV {

    private String producer;

    private int size;

    public TV(String producer, int size) {
        this.producer = producer;
        this.size = size;
    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TV{" +
                "producer='" + producer + '\'' +
                ", size=" + size +
                '}';
    }
}
