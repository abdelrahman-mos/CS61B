public class Dog {
    public int weightInPounds;
    public static String binomen = "canis familiaris";

    public Dog(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public void makeNoise() {
        if (weightInPounds < 5) {
            System.out.println("yipyipy!");
        } else if (weightInPounds < 30) {
            System.out.println("bark!");
        } else {
            System.out.println("Aroooooooo!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2) {
        return d1.weightInPounds > d2.weightInPounds ? d1 : d2;
    }

    public Dog maxDog(Dog d2) {
        return this.weightInPounds > d2.weightInPounds ? this : d2;
    }

    public static Dog[] largerThanFourNeighbors(Dog[] dogs) {
        Dog[] largerDogs = new Dog[dogs.length];
        System.arraycopy(dogs, 0, largerDogs, 0, largerDogs.length);
        return largerDogs;
    }
}
