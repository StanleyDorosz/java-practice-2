public class VariablePractice {
    public static void main(String[] args) {

        byte age;
        age = 27;

        short monthsOld = 331;

        char favoriteSymbol1, favoriteSymbol2;
        favoriteSymbol1 = ',';
        favoriteSymbol2 = '_';

        boolean isAdult = true, isOld = false;

        double rating = 10.0, rank = 3.0;

        int numberOfCats = 7, numberOfDogs = 5;

        String greeting1 = "hello";
        String greeting2 = "world";

        System.out.println(rating + rank + greeting1);
        System.out.println(greeting1 + favoriteSymbol1 + " " + greeting2 + favoriteSymbol2 + numberOfCats + numberOfDogs);
        System.out.println(greeting1 + rank + numberOfCats + greeting2);
        System.out.println(numberOfCats + numberOfDogs + greeting2 + numberOfDogs + rating);
    }
}
