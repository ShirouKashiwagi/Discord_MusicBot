package com.discord.MusicBot;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class AudioController extends ListenerAdapter {
	
	private final AudioService audioService;
	private final FileRepository fileRepository;
	
	public AudioController(AudioService audioService, FileRepository fileRepository) {
		this.audioService = audioService;
		this.fileRepository = fileRepository;
	}
	
	@Override
	public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
		switch(event.getName()){
			case "list" -> {
				var files = fileRepository.getMp3Files();
			}
		}
	}
}