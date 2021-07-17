from textblob import TextBlob
Word="cmputer"
m=TextBlob(Word)
print("Original Text: ",str(m.correct()))
