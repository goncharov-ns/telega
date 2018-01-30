package ru.gns34.telega.bot.hadler;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import ru.gns34.telega.bot.Gns34Bot;

/**
 * @author Nikita
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("https.protocols", "TLSv1.1");
		
		ApiContextInitializer.init();
		
		TelegramBotsApi botsApi = new TelegramBotsApi();
		
		try {
            botsApi.registerBot(new Gns34Bot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
	}

}
