package comidev.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "comidev", groupId = "groupId")
    public void listener(String data) {
        System.out.println("Recibido: "+data+" 🦍");
    }
}
