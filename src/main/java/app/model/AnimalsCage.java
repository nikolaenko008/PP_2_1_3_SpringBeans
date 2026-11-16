package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    // Связывание по имени: поле "dog" -> бин Dog
    @Autowired
    private Animal dog;

    // Timer — бин-синглтон, внедрён контейнером
    @Autowired
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(dog.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    public Animal getAnimal() {
        return dog;
    }

    public Timer getTimer() {
        return timer;
    }
}
