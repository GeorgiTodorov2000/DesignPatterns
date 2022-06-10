package models;

import command.Command;
import command.NeedBike;
import command.NeedDoll;
import command.RemoteController;
import observer.Topic;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Santa {
    private static Santa single_instance = null;

    public static Santa getInstance()
    {
        if (single_instance == null)
            single_instance = new Santa();

        return single_instance;
    }

    public static String askForToy() {
        Scanner scan = new Scanner(System.in);
        RemoteController remote = new RemoteController();
        Command NeedBike = new NeedBike();
        Command NeedDoll = new NeedDoll();

        Topic topic = new Topic();

        System.out.println("What toy do you want type the number: ");
        System.out.println("1. Bike");
        System.out.println("2. Doll");
        int toy = scan.nextInt();
        if(toy == 1) {
            remote.setCommand(NeedBike);
            remote.pressButton();
            return "Bike";
        } else if(toy == 2) {
            remote.setCommand(NeedDoll);
            remote.pressButton();
            return "Doll";
        } else {
            System.out.println("Toy with that number does not exist");
            return "Null";
        }
    }
}
