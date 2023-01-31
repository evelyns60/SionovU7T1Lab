import java.util.ArrayList;

public class CatRunner {
    public static void main(String[]args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Evelyn");
        Cat cat2 = new Cat("Ethan");
        Cat cat3 = new Cat("Elaine");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("Edward");
        Cat prevCat = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(prevCat);

        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4);

        cats.add(new Cat("Sam"));

        for (int i = 0; i < cats.size(); i ++) {
            cats.get(i).setName(cats.get(i).getName().toUpperCase());
        }
        System.out.println(cats);
    }
}
