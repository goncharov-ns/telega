package ru.gns34.telega.bot;

import org.junit.Test;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * @author Nikita
 *
 */
public class RunBotTest {

	@Test
	public void run() {
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
