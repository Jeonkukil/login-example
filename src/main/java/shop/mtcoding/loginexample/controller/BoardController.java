package shop.mtcoding.loginexample.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import shop.mtcoding.loginexample.model.Board;
import shop.mtcoding.loginexample.model.BoardRepository;
import shop.mtcoding.loginexample.model.User;
import shop.mtcoding.loginexample.model.UserRepository;

@Controller
public class BoardController {

    @Autowired
    private HttpSession session;

    @Autowired
    private UserRepository userRepository;

    @GetMapping({ "/", "main" })
    public String main() {

        return "board/main";
    }

}
