package com.agenda.Agenda.service;

import com.agenda.Agenda.bot.MeuTelegramBot;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

@Service
public class TelegramBotService {

    private final MeuTelegramBot meuTelegramBot;

    public TelegramBotService(MeuTelegramBot meuTelegramBot) {
        this.meuTelegramBot = meuTelegramBot;
    }

    public Message enviarMensagem(String chatId, String texto) throws Exception {
        SendMessage mensagem = new SendMessage(chatId, texto);
        return meuTelegramBot.execute(mensagem);
    }
}