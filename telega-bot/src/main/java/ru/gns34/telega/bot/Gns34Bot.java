package ru.gns34.telega.bot;

import org.telegram.telegrambots.ApiContext;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Gns34Bot extends TelegramLongPollingBot {

	private static final DefaultBotOptions INSTANCE = ApiContext.getInstance(DefaultBotOptions.class);
	static {
		//INSTANCE.setBaseUrl("http://api.telegram.org/bot");
	}

	public Gns34Bot() {
		super(INSTANCE);
	}

	@Override
	public void onUpdateReceived(Update update) {
		System.out.println("DDDD" + update);
		SendMessage message = new SendMessage();
		message.setChatId(update.getMessage().getChatId());
		message.setText(update.getMessage().getText());
		try {
			execute(message);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getBotUsername() {
		return "GNS34Bot";
	}

	@Override
	public String getBotToken() {
		return "484140710:FpnGmFQUmACQg4ORnyDry1yEvnj-7d1OA";
	}

}
