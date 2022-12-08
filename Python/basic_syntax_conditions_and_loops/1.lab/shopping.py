budget = int(input())
command = input()

while not command == "End":
    expense = int(command)
    budget -= expense
    if budget < 0:
        print("You went in overdraft!")
        break
    command = input()

else:
    print("You bought everything needed.")
