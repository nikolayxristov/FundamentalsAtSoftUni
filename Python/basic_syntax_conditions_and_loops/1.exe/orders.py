n = int(input())
total = 0

for i in range(n):
    price = float(input())
    days = int(input())
    need = int(input())

    if 0 < price <= 100 and 0 < days < 32 and 0 < need <= 2000:
        current_total = price * days * need
        print(f"The price for the coffee is: ${current_total:.2f}")
        total += current_total

print(f"Total: ${total:.2f}")
