package vn.com.music.server.common.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ApiResponse<T> {
    private int status; // 200, 400, 401, 500
    private String message;
    private T data; // Payload thực tế
    private LocalDateTime timestamp;
}
