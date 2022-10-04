import math
if __name__ == '__main__':
    x=input()
    l=len(x)
    m=l%8
    y=math.floor(l/8)
    for i in range(y):
        print(x[i*8:i*8+8])
    if(m>0):
        print(x[y*8:y*8+8]+'0'*(8-m))



