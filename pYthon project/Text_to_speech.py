from gtts import gTTS
import os

file=open("your file name")

x=file.read()

language='en'

welcome=gTTS(text=x,slow=False)

welcome.save("Welcome.wav")

os.system("Welcome.wav")
