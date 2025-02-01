import time

mytime = int(input("Enter time : "))

# for x in range(0, time):
#     print(x)
#     time.sleep(1)

# for backqards

# for x in reversed(range(0, mytime)):
#     print(x)
#     time.sleep(1)

# another technique

for x in range(mytime, 0, -1):
    seconds = x%60
    minutes = int(x/60)%60
    hours = int(x/3600)
    print(f"{hours:02}:{minutes:02}:{seconds:02}")
    time.sleep(1)

print("Time's up!")