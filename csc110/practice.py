def displayFibonacci(maxNum):

    num0 = 0
    num1 = 1
    num2 = 1


    print(num0,end='')
    print(num0,end='')


    while num2 <= maxNum:
        print(num2, end='')
        num0 = num1
        num1 = num2
        num2 =num0 + num1

    displayFibonacci(10000)