# Python program to test internet Speed...
import speedtest

st=speedtest.Speedtest()

Download=st.download()

upload=st.upload()

print('Your connection download speed is:',Download)
print('Your connection upload speed is:',upload)
