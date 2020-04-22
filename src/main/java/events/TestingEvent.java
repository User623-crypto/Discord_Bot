package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class TestingEvent extends ListenerAdapter{
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event)
	{
		String []messageSent=event.getMessage().getContentRaw().split(" ");
		String name=event.getMember().getUser().getName();
		for(int i=0;i<messageSent.length;i++) {
		
		if(messageSent[i].equalsIgnoreCase("hello")) {
			if(!event.getMember().getUser().isBot())
			{
				event.getChannel().sendMessage("hi "+name+" "+event.getGuild().getId()).queue();
				break;
			}
			
			}
		}
		
	}

}
