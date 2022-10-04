if __name__ == '__main__':
    str1 =  input()
    str2=str1[::-1]
    str3=''
    for x in str2:
        if(str3.__contains__(x)==False):
            str3=str3+x
    print(str3)
