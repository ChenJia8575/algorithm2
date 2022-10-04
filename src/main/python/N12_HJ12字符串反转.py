if __name__ == '__main__':
    str =  input()
    assert len(str)<=1000
    assert str.islower()
    print(str[::-1])