package events;

import net.dv8tion.jda.api.events.channel.category.CategoryCreateEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class TestingEvent2 extends ListenerAdapter {

	public void onCategoryCreate(CategoryCreateEvent e)
	{
		//e.getCategory().getTextChannels().
	}
}
