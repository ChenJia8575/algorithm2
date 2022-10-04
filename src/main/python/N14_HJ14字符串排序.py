if __name__ == '__main__':
    num = int(input())
    list1=[]
    for i in range(num):
        str=input()
        list1.append(str)
    list1.sort()
    for x in list1:
        print(x)