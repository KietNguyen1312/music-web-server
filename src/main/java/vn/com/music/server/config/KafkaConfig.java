package vn.com.music.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@Configuration
@EnableKafka
public class KafkaConfig {
    @Value("{KAFKA_BOOTSTRAP_SERVERS")
    private String bootstrapServers;

    @Value("${KAFKA_SASL_JAAS_CONFIG}")
    private String saslJaasConfig;

}
