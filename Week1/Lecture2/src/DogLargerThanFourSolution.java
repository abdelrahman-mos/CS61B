public class DogLargerThanFourSolution {

    public static Dog[] largerThanFourNeighbors(Dog[] dogs) {
        Dog[] largerDogs = new Dog[dogs.length];
        int cnt = 0;
        for (int i = 0; i < dogs.length; i++) {
            if (isBiggerThanFour(dogs, i)) {
                largerDogs[cnt] = dogs[i];
                cnt++;
            }
        }
        return largerDogs;
    }

    public static boolean isBiggerThanFour(Dog[] dogs, int index) {
        boolean isBigger = true;
        for (int j = -2; j <= 2; j++) {
            if (j == 0) continue;
            int compIndex = j + index;

            if (isValidIndex(dogs, compIndex)) {
                isBigger = dogs[compIndex].weightInPounds < dogs[index].weightInPounds;
            }

            if (!isBigger) {
                return false;
            }
        }
        return isBigger;
    }

    public static boolean isValidIndex(Dog[] dogs, int index) {
        return index >= 0 && index < dogs.length;
    }
}
