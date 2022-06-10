import observer.Elf;
import models.Santa;
import observer.Observer;
import observer.Topic;

public class MainApp {
    public static void main(String[] args) {
        Santa.getInstance();
        Topic topic = new Topic();
        Observer elf1 = new Elf("Elf 01");

        topic.subscribe(elf1);
        String toy = Santa.askForToy();
        if(toy.equals("Bike")) {
            topic.setTopic("Santa wants a Bike");
        } else if(toy.equals("Doll")) {
            topic.setTopic("Santa wants a Doll");
        }





    }


}
