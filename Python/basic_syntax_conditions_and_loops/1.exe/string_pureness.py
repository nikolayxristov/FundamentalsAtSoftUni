n = int(input())

for i in range(n):
    word = input()

    if not word.__contains__(",") and not word.__contains__(".") and not word.__contains__("_"):
        print(f"{word} is pure.")
    else:
        print(f"{word} is not pure!")
