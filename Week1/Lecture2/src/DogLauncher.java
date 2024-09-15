public class DogLauncher {
    public static void main(String[] args) {
        Dog maya = new Dog(40);
        maya.makeNoise();
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(3);
        dogs[1] = new Dog(20);
        dogs[0].makeNoise();
        dogs[1].makeNoise();
    }
}
