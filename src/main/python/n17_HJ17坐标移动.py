input_list = input().split(';')
initial = [0,0]

for item in input_list:
    if not 2 <= len(item) <= 3:
        continue

    try:
        direction = item[0]
        step = int(item[1:])
        if direction in ['A', 'D', 'W', 'S']:
            if 0 <= step <= 99:
                if direction == 'A':
                    initial[0] -= step
                elif direction == 'D':
                    initial[0] += step
                elif direction == 'S':
                    initial[1] -= step
                elif direction == 'W':
                    initial[1] += step
    except:
        continue

print(str(initial[0]) + ',' + str(initial[1]))