import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;


import java.util.Properties;

    public class Countryproducer {
        public static  void main(String args[])
        {
            KafkaProducer producer;
            String broker ="localhost:9092";
            String topic ="country";
            Properties props = new Properties();
            props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,broker);
            props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
            props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());
            producer = new KafkaProducer(props);
            String dataToSend="india is my country";
            producer.send(new ProducerRecord(topic,dataToSend));
            producer.close();
        }
    }




