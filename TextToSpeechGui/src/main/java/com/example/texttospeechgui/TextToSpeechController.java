package com.example.texttospeechgui;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.util.ArrayList;

public class TextToSpeechController {
    private static VoiceManager voiceManager = VoiceManager.getInstance();
    public static ArrayList<String> getVoices(){
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        ArrayList<String> voices = new ArrayList<>();
        for (Voice voice: voiceManager.getVoices()){
            voices.add(voice.getName());
        }
        return voices;
    }

    public static ArrayList<String> getSpeedRates(){
        ArrayList<String> speedRates = new ArrayList<>();
        speedRates.add("60"); //very slow
        speedRates.add("100"); //slow
        speedRates.add("140"); //normal
        speedRates.add("170"); //fast
        speedRates.add("200"); //very fast
        return speedRates;
    }

    public static ArrayList<String> getVolumeLevels(){
        ArrayList<String> volumeLevels = new ArrayList<>();
        for(int i=0;i<=10;i++){
            volumeLevels.add(Integer.toString(i));
        }
        return volumeLevels;
    }

    public static void speak(String message, String voiceType, String rate, String volume){
        Voice voice = VoiceManager.getInstance().getVoice(voiceType);
        if (voice == null) {
            System.err.println("Cannot find voice: kevin16");
            System.exit(1);
        }
        voice.allocate();
        voice.setRate(Integer.parseInt(rate));

        voice.setVolume(Integer.parseInt(volume));

        voice.speak(message);

        voice.deallocate();
    }
}