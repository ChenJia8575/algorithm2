if __name__ == '__main__':
    str1 = input()
    s=0
    for x in set(str1):
        y=ord(x)
        if(y>=0 and y<=127):
            s=s+1
    print(s)