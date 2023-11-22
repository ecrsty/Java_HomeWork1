package Task2;
import Task2.items.Beer;
import Task2.items.Book;
import Task2.items.Shoes;

import java.util.Scanner;

public class Warehouse {

    public static void main(String[] args) {
        BoxWithBeer beerBox = new BoxWithBeer();
        BoxWithBooks bookBox = new BoxWithBooks();
        BoxWithShoes shoesBox = new BoxWithShoes();

        beerBox.put(new Beer("Heineken", 0.43));
        bookBox.put(new Book("Преступление и наказание", "Ф.М.Достоевский"));
        shoesBox.put(new Shoes("Кроссовки", "Adidas", 41));


        beerBox.open();
        Beer beer = beerBox.removeFromBox();
        beerBox.open();

        Beer b = beerBox.removeFromBox();

        shoesBox.put(new Shoes("Ботинки", "Ekonika", 38));
        Shoes shoe = shoesBox.open();
        System.out.println(shoe.getBrand());
    }
}
