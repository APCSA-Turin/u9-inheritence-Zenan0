package U9T3;

import U9T1Lab2.Computer;
import U9T1Lab2.Desktop;
import U9T1Lab2.Laptop;

public class Main {
    public static void main(String[] args) {
        Agent maria = new Agent("Maria Hilliard", "917-221-3451");
        Dancer tony = new Dancer("Tony Danza", 32, maria, 11);
        System.out.println(tony.getName()); // call overridden method
    }
}
