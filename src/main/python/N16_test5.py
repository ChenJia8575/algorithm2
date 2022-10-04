n, m = map(int, input().split())

primary, sun = {}, {}
for i in range(1, m + 1):
    x, y, z = map(int, input().split())
    if z == 0:
        primary[i] = [x, y]
    else:
        if z in sun:
            sun[z].append([x, y])
        else:
            sun[z] = [[x, y]]
dp = [0] * (n + 1)
print(primary)
print(sun)
print(len(dp))

for dad in primary:
    print('-----------')
    w, v = [], []
    w.append(primary[dad][0])  # 1、主件
    v.append(primary[dad][0] * primary[dad][1])
    print('w',w)
    print('v',v)
    if dad in sun:  # 存在附件
        w.append(w[0] + sun[dad][0][0])  # 2、主件+附件1  用来判断重量
        v.append(v[0] + sun[dad][0][0] * sun[dad][0][1]) # 用来判断价值
        if len(sun[dad]) > 1:  # 附件个数为2
            w.append(w[0] + sun[dad][1][0])  # 3、主件+附件2
            v.append(v[0] + sun[dad][1][0] * sun[dad][1][1])
            w.append(w[0] + sun[dad][0][0] + sun[dad][1][0])  # 4、主件+附件1+附件2
            v.append(
                v[0]
                + sun[dad][0][0] * sun[dad][0][1]
                + sun[dad][1][0] * sun[dad][1][1]
            )
            print('附件个数为2 w',w)
            print('附件个数为2 v',v)
    for j in range(n, -1, -10):  # 物品的价格是10的整数倍
        for k in range(len(w)):
            if j - w[k] >= 0:
                dp[j] = max(dp[j], dp[j - w[k]] + v[k])

print(dp[n])
