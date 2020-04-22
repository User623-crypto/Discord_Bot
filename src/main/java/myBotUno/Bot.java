package myBotUno;

import java.util.Timer;

import javax.security.auth.login.LoginException;

import events.TestingEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.GuildChannel;
import net.dv8tion.jda.api.entities.Invite.Channel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Bot {
	
	public static void main(String args[]) throws LoginException
	{
		//Timer timer=new Timer();
		JDA jda=new JDABuilder("Njk3NTgxMDk4NzQ5OTE5MjUz.Xo5XKw.wvhoTBdDY1cgTTtwU14qJB9zbqk").build();
		jda.addEventListener(new TestingEvent());
		//jda.getGuildById("697569483472240781").
		///jda.getGuildChannelById("697569484034146367").
		//GuildChannel a= jda.getGuildChannelById("697569484034146367");
		//for(a:jda.getCategoriesByName("", true).)
		//timer.s
		
		//EventWaiter waiter=new EventWaiter();
		
	}
	

}
