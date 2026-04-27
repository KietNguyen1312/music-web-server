package vn.com.music.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing // <--- Thêm dòng này vào
public class JpaConfig {
}