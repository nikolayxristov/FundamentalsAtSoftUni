divisor = int(input())
bound = int(input())

while True:
    if bound % divisor == 0:
        print(bound)
        break
    else:
        bound -= 1
