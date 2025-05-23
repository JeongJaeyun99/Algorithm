n = int(input())
star = ""
for i in range(n):
    star += "*" * (i+1)
    star += "\n"
print(star)