public class DogLauncher {
    public static void main(String[] args) {
        Dog maya = new Dog(25);
//        maya.makeNoise();
//        Dog[] dogs = new Dog[2];
//        dogs[0] = new Dog(3);
//        dogs[1] = new Dog(20);
//        dogs[0].makeNoise();
//        dogs[1].makeNoise();
        Dog kabir = new Dog(60);
        Dog.maxDog(maya, kabir).makeNoise();

        kabir.maxDog(maya).makeNoise();

        System.out.println(Dog.binomen);
        Dog[] dogs = new Dog[10];
        dogs[0] = new Dog(5);
        dogs[1] = new Dog(4);
        dogs[2] = new Dog(3);
        dogs[3] = new Dog(2);
        dogs[4] = new Dog(1);
        dogs[5] = new Dog(3);
        dogs[6] = new Dog(2);
        dogs[7] = new Dog(1);
        dogs[8] = new Dog(3);
        dogs[9] = new Dog(2);

        Dog[] outDogs = Dog.largerThanFourNeighbors(dogs);
    }
}
