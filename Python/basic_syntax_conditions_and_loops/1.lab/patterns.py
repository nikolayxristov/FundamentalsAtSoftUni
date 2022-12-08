pattern = int(input())
top_stars, bottom_stars = "", ""


for i in range(1, pattern + 1):
    for j in range(0, i):
        print("*", end="")
    print()

for i in range(pattern - 1, 0, -1):
    for j in range(0, i):
        print("*", end="")
    print()


