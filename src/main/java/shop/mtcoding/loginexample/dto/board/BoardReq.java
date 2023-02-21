package shop.mtcoding.loginexample.dto.board;

import org.springframework.web.bind.annotation.GetMapping;

import lombok.Getter;
import lombok.Setter;

public class BoardReq {

    @Getter
    @Setter
    public static class BoardReqDto {

        private int id;
        private String username;
    }
}
