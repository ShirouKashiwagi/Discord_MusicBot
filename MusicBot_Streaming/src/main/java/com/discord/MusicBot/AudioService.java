import java.util.List;

public class AudioService {

    private final FileRepository fileRepository;

    public AudioService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    // ファイル一覧を返す
    public List<String> listFiles() {
        return fileRepository.findAllAudioFiles();
    }

    // 指定ファイルを再生する（中身はあとで詰める）
    public void play(String fileName) {
        // TODO: LavaPlayer で fileName をロードして再生
    }

    // ランダム再生
    public void playRandom() {
        List<String> files = listFiles();
        if (files.isEmpty()) return;
        String random = files.get((int)(Math.random() * files.size()));
        play(random);
    }

    // 停止
    public void stop() {
        // TODO: プレイヤー停止処理
    }

    // 一時停止
    public void pause() {
        // TODO: pause 処理
    }

    // 再開
    public void resume() {
        // TODO: resume 処理
    }

    // VC から切断
    public void disconnect() {
        // TODO: VC 切断処理
    }
}
