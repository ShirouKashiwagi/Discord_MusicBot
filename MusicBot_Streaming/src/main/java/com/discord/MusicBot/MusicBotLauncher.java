package com.discord.MusicBot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class MusicBotLauncher {
	
	
	private static JDA jda = null;
	// botのトークン情報を設定
	private static final String BOT_TOKEN = "MTUyNDc3MDQzMTM1NjI0NDE0OA.GYsorV.epHw_2eYj6qndFH2atdydVnTAK63a35advaUOE";
	
	// bot起動
	public static void main(String[] args) {
		jda = JDABuilder.createDefault(BOT_TOKEN)
                .setRawEventsEnabled(true)
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .addEventListeners(new MusicBotLauncher())
                .setActivity(Activity.competing("Bot開発中"))
                .build();

		jda.updateCommands().queue();

	}
}
