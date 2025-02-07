import speech_recognition as sr

recognizer = sr.Recognizer()

# Use your microphone as the audio source
with sr.Microphone() as source:
    print("Adjusting for ambient noise... Please wait.")
    recognizer.adjust_for_ambient_noise(source)
    print("Say something...")

    # Capture the audio
    try:
        audio = recognizer.listen(source, timeout=5)
        print("Recognizing...")
        
        # Test with Google API
        text = recognizer.recognize_google(audio)
        print("Google API Transcription:", text)
    except sr.UnknownValueError:
        print("Google API could not understand the audio.")
    except sr.RequestError as e:
        print(f"Could not request results from Google API; {e}")