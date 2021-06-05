import os
import datetime
import time
year, month, day = input("Enter the Date =  ").split("/")
hour, min, sec = input("Enter the Time =  ").split(":")
shedule_date = datetime.date(int(day), int(month), int(year))
n = 1
while n > 0:
    if time.localtime().tm_hour==int(hour) and time.localtime().tm_min==int(min) and time.localtime().tm_sec==int(sec) and datetime.date.today()==shedule_date:
        os.startfile("C:\\Users\\Dell\\Music\\songs\\iphone 6 original.mp3")
        break
    else:
        n += 1
