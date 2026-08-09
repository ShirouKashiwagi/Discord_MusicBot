package com.discord.MusicBot;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileRepository {
	
    private final String musicFolderPath;

    public FileRepository(String musicFolderPath) {
        this.musicFolderPath = musicFolderPath;
    }

    public List<String> findAllAudioFiles() {
        File folder = new File(musicFolderPath);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".mp3"));

        if (files == null) return List.of();

        return Arrays.stream(files)
                .map(File::getName)
                .toList();
    }

    public String getFilePath(String fileName) {
        return musicFolderPath + "/" + fileName;
    }

}
