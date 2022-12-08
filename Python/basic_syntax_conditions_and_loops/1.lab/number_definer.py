num = float(input())

if 0 < num < 1:
    print("small positive")

elif 0 > num > -1:
    print("small negative")

elif 0 < num <= 1000000:
    print("positive")

elif 0 > num >= -1000000:
    print("negative")

elif num > 1000000:
    print("large positive")

elif num < -1000000:
    print("large negative")

else:
    print("zero")
