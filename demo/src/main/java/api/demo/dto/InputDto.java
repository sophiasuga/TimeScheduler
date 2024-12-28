package api.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InputDto {
    private String sendTime;
    private String mailContent;
}
