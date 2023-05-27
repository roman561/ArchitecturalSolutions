package edu.ua.khpi.architectural.solutions.lab9;

public class Main {
    public static void main(String[] args) {
        String videoPath = "path/video.mp4";
        String apiKey = "your_api_key";

        uploaderFacade uploaderFacade = new uploaderFacade();
        videoUploaderFacade.uploadVideo(videoPath, apiKey);
        System.out.println(" Done ");
    }


}
