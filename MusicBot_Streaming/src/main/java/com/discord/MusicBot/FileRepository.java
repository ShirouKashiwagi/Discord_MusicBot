package com.discord.MusicBot;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileRepository {
	
    private final String musicFolderPath;

    public FileRepository(String musicFolderPath) {
        this.musicFolderPath = musicFolderPath;
    }

    // 音楽全件検索
    public List<String> findAllAudioFiles() {
    	
    	// フォルダ変数の定義 
        File folder = new File(musicFolderPath);
        // ファイルパス先の.mp3を全件検索
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".mp3"));

        // 検索結果がnull以外の場合 - nullの場合空を返却
        if (files == null) return List.of();

        // File[]をリストに変換して返却
        return Arrays.stream(files)
                .map(File::getName)
                .toList();
    }
    
    public String getFilePath(String fileName) {
        return musicFolderPath + "/" + fileName;
    }
}
