package com.agenda.Agenda.controller;

import com.agenda.Agenda.service.TelegramBotService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/telegram")
public class TelegramController {

    private final TelegramBotService telegramBotService;

    public TelegramController(TelegramBotService telegramBotService) {
        this.telegramBotService = telegramBotService;
    }

    @PostMapping("/enviar")
    public ResponseEntity<?> enviarMensagem(@RequestParam String chatId, @RequestParam String texto) {
        try {
            telegramBotService.enviarMensagem(chatId, texto);
            return ResponseEntity.ok("Mensagem enviada!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro ao enviar mensagem: " + e.getMessage());
        }
    }
}