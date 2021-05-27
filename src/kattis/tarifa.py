x = int(input())
no_of_lines = int(input())

values = []
for i in range(no_of_lines):
    values.append(int(input()))

total = 0
for i in values:
    total += x - i

print(total + x)
