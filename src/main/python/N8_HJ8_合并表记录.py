
if __name__ == '__main__':
    num = int(input())
    map = {}
    for i in range(num):
        arr = input().split(' ')
        k=int(arr[0])
        v=int(arr[1])
        map[k] = map.get(k,0) + v
    s2=sorted(map.items(),key=lambda x:x[0])
    for (k,v) in s2:
        print(str(k)+" "+str(v))
