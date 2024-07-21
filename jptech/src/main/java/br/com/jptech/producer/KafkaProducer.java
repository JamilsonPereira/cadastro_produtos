package br.com.jptech.producer;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.FailureCallback;
import org.springframework.util.concurrent.SuccessCallback;

import java.util.logging.Logger;

import static org.apache.kafka.common.requests.DeleteAclsResponse.log;

@Slf4j
public class KafkaProducer {

   // private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(final String topic,
                     final String key,
                     final String message) {
        log.info("sending message to topic {} with key {} - message {}", topic, key, message);
        kafkaTemplate.send(topic, key, message
        );

    }

    private SuccessCallback<? super SendResult<String, String>> handleSuccess(final String topic, final String key, final String message) {
        return result -> log.info("message sent to topic {} with key {} - message {}", topic, key, message);
    }

    private FailureCallback handleFailure(final String topic, final String key, final String message) {
        return exception -> log.error("error sending message to topic {} with key {} - error {} message {}", topic, key, exception, message);
    }
}
