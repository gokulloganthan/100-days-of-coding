#   Time Complexity
##  time complexity != total time taken

### What is time complexity?
-    It says how the time will grow as the input size grow

![img.png](img.png)


### Why ?
-   To understand the performance of the algorithmns with respect to time and input size
    -   ![img_1.png](img_1.png)

### What do consider when thinking about complexity ?
  - Always look first for worst case complexity 
  - Always take large data size to analyze complexity
    - !![img_4.png](img_4.png)
  - we ignore all constants to understand the behavior/pattern of the complexity
  - Always ignore less dominating terms/constants in equation as that value doesn't even matter in the large huge volume of data
    - ![img_3.png](img_3.png)
  - Order of complexity as O(1) < O(log(N)) < O(N) < (2^N)
    - ![img_5.png](img_5.png)

# Big O ?
  - This says it is the upper bound time complexity
  - i.e the maximum threshold of the complexity of algorithm
  - at any case the time complexity will not exceed  above the specified complexity O(N) for instance
  - if the algorithm is marked as O(n) even how much data you feed it won't increase the complexity from n to n^2

## Maths perspective
-   ![img_6.png](img_6.png)
-   ![img_7.png](img_7.png)

Math Observation:
  when N tends to infinity , when dividing the eq A with eq B where each has dominence upto N^3 for example it will always lie before the infinity
  So no huge data input could never false the Big(O) complexity of the algorithm

#   Big Omega
-   This says it is the lower bound time complexity
-   i.e the bare minimum complexity of algorithm
-   at any case the time complexity may exceed the computed complexity but never comes below 
-   if algo is marked as omega(N^2) then in some cases it may go to complexity of omega(N^3) or higher but never goes below to omega (N^2)
- ![img_8.png](img_8.png)

## Math Observation
- when N tends to infinity , when dividing the eq A with eq B where each has dominence upto N^3 for instance it will always lie above the 0
- So no huge data input could never false the omega(O) complexity of the algorithm

Note: we not considering Big Omega in time complexity perspective as it has only lower bound i.e best case but we always look for worst case that is the upper bound i.e Big O


#   Big Theta
-   This combines both upper bound and lower bound time complexity
-   ![img_9.png](img_9.png)



#   Little O
-   This denotes the time complexity of upper bound but with strong statement
-   In big O we conclude the y is lessorequal to x then in little O we say y is strictly lesser than x 
-   ![img_10.png](img_10.png)

## Math Observation
-   ![img_11.png](img_11.png)


#   Little Omega
-   This denotes the time complexity of lower bound but with strong statement
-   In big omega if we conclude y is greaterorequal to x then in little omega we strongly say always y is greater than x
  - ![img_12.png](img_12.png)


## Maths Observation
-   ![img_13.png](img_13.png)

