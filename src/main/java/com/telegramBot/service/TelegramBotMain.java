package com.telegramBot.service;

import com.telegramBot.settings.YAMLConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramBotMain extends TelegramLongPollingBot {

    @Autowired
    private YAMLConfig yamlConfig;

    @Override
    public String getBotUsername() {
        return yamlConfig.getName();
    }

    @Override
    public String getBotToken() {
        return yamlConfig.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {

    }

}
