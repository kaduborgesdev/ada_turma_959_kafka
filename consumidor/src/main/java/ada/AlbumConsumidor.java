package ada;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AlbumConsumidor {

    private final String topicName = "ALBUM_CRIADO";

    @KafkaListener(topics = "ALBUM_CRIADO", groupId = "group_id_2")
    public void consume(ConsumerRecord<String, String> payload){
        log.info("Tópico: {}", topicName);
        log.info("key: {}", payload.key());
        log.info("Headers: {}", payload.headers());
        log.info("Partion: {}", payload.partition());
        log.info("Order: {}", payload.value());

        // tenta criar as figurinhas
        // Se ocorreu um problema na criação dela
            // Lançar evento de erro para apagar o album criado
            // figurinhas_criacao_erro - album_id
        // Se funcionou
            // Lançar evento de sucesso
            // figurinhas_criacao_sucesso
    }

}