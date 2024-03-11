package lessons.lesson38;

//1. Создать класс Car (параметр - количество дверей)
//2. В этом автомобиле создать объект Door
//у которого будут характеристики длина и высота
//и который бы умел открываться и закрываться


public class Car {

    private int doorsNum;
    private Door[] doors;


    public Car(int doorsNum, int width, int height) {
        this.doorsNum = doorsNum;
        doors = new Door[doorsNum];

        for (int i = 0; i < doorsNum; i++) {
            doors[i] = new Door(width, height);
        }

    }

    public void openDoor(int index){
        if (index>=0 && index< doorsNum){
            doors[index].open();
        } else{
            System.out.println("Wrong variable");
        }
    }

    public  void closeDoor(int index){
        if (index >=0 && index < doorsNum){
            doors[index].close();
        } else{
            System.out.println("Wrong variable");
        }
    }



    public class Door{
        private int width;
        private int height;
        private boolean opened;

        public Door(int width, int height) {
            this.width = width;
            this.height = height;
            this.opened = false;
        }

        private void open(){
            if (!opened){
                opened = true;
                System.out.println("Door is opened");
            } else{
                System.out.println("This door is already opened");
            }
        }

        private void close(){
            if (opened){
                opened = false;
                System.out.println("Door is closed");
            } else{
                System.out.println("This door is already closed");
            }
        }



        public void openDoor(){
            System.out.println("Door is opened");
        }
        public void closeDoor(){
            System.out.println("Door is closed");
        }
    }

}
