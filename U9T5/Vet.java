package U9T5;

import java.util.ArrayList;

public class Vet {
    private String vetName;
    private ArrayList<Animal> clients;


    public Vet(String name) {
        vetName = name;
        clients = new ArrayList<Animal>();
    }

    public boolean addClient(Animal animal) {
        if (clients.indexOf(animal) == -1) {
            clients.add(animal);
            System.out.println("Welcome to " + vetName + "'s' office, " + animal.getName());
            return true;
        } else {
            System.out.println(animal.getName() + " is already a client of " + vetName);
            return false;
        }
    }

    public void printClientList() {
        for (Animal client : clients) {
            System.out.println(client.getName() + ": " + client.getClass());
        }
    }
}
