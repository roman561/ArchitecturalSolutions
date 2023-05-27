package edu.ua.khpi.architectural.solutions.lab9;

public class UploaderFacade {
    private Converter converter;
    private YoutubeAPI youtubeAPI;

    public UploaderFacade() {
        this.converter = new converter();
        this.youtubeAPI = new youtubeAPI();
    }
    public void uploadVideo(String videoPath, String apiKey) {
        String converted = converter.convert(videoPath);
        youtubeAPI.uploadVideo(convertedPath, apiKey);
    }

}
