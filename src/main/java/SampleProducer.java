import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class SampleProducer {
    public SampleProducer(){
        Properties kafkaProperties = new Properties();
        kafkaProperties.put("bootstrap.servers",  "192.168.159.128:9092");
        kafkaProperties.put("key.serializer",  "org.apache.kafka.common.serialization.StringSerializer");
        kafkaProperties.put("value.serializer",  "org.apache.kafka.common.serialization.StringSerializer");


        ProducerRecord myKafkaProducerRecord = new ProducerRecord("channel", "name", "selftuts");
        KafkaProducer myKafkaProducer = new KafkaProducer(kafkaProperties);
        myKafkaProducer.send(myKafkaProducerRecord);
        myKafkaProducer.close();
    }

}

