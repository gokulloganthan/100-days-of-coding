# Bitwise Operations
-   Every arithmatic operation add,subtract,multiply,divide or carried in binary form internally
-   ![img_6.png](img_6.png)

##  My Observation
### AND
    -   if A & B are operands , A & B always returns A if A is 0 / B if A is 1 B is 0
    -   0(A value) & 1(B value) returns 0(A value) 

### XOR & Complement
    - XOR result is true only if atmost A or B is true not both
    - A XOR with any number returns complement(opposite of A) if B is not same as A
        -  0(A value) & 1(B) returns 1(complement of A)
        - A(0) & A(0) returns 0
        - A(0) & 1 returns 1

### Left shift (multiply)
-   moves the digits to the left to specificied b times then replaced the place with 0
-   ![img_5.png](img_5.png)
-   ![img_4.png](img_4.png)
-   if a << b , then a is going to be converted to a * 2^b


### Right Shift (divide)
-   moves the digits to the right
-   if a >> b , then a is going to be converted to (a / 2^b)

### Addition
-   adds the digits of a & b
-   if 1  and 1 is added will result to 10 so it keeps 0 and carries 1 to next addition

## Number systems
-   Decimal - 0 to 9 (we use it in real life day-to-day activities)
-   Octal - 0 to 8
-   Hexadecimal - 0 to 9,A,B,C,D,E,F
-   Binary - 0,1
-   ![img.png](img.png)


## convert decimal to any base (2/8/16) format
-   ![img_1.png](img_1.png)

## convert any base to decimal
-  ![img_2.png](img_2.png)
-  ![img_3.png](img_3.png)



Even or Odd
-   An number is said to odd or even depending on the last digit in binary 
-   evry number after the first binary digit is going to be odd because 2 ^ anything * anything is always even
-   But 2 ^ 0 * odd (1) is 1 and 2^0 * even (0) is even 
  - so any number binary representation last digit is the deciding factor of an number to be odd or not
  - beacuse adding this to previous digits calculation completely changes the evenity /oddity of an no
-   ![img_7.png](img_7.png)