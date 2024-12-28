package api.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
        @GetMapping("/sendmail")
    public String display(){ 
        
        /* メール時間・メール内容 */
        String sendTime = "14:30";
        String mailContent = "会議の内容があるため、遅れないようにしよう";
        
        

        return "index"; 
}
}
