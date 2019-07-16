package techtoolbot.JanuszewskiBot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;

public class Main {
	public static JDA jda;
	public static String prefix = "~";
	
	
	//Main method
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws LoginException{
		jda = new JDABuilder(AccountType.BOT).setToken("").buildAsync();
		jda.getPresence().setStatus(OnlineStatus.IDLE);
		jda.getPresence().setGame(Game.watching("Przerwa Techniczna"));
		
		jda.addEventListener(new Commands());
	}
}
