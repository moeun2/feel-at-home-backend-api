package com.athome.feel.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/logout")
    public void logout(HttpSession session) {
        session.invalidate();
    }

    @GetMapping("/login/callback/spotify")
    public ResponseEntity<?> spotifyLogin(@RequestParam("code") String code) {
        System.out.println(code);
        return ResponseEntity.ok(code);
    }

    static class Token {
        String accessToken;
        String refreshToken;

        public Token(String accessToken, String refreshToken) {
            this.accessToken = accessToken;
            this.refreshToken = refreshToken;
        }
    }
}
