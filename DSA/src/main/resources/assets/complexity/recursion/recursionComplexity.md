
#   Recursion Complexity
-   At any point of time , no two sibiling nodes(each node denotes the function call and its storage in stack) (denoting calls in stack) can be/occur at a time
-   In an stack if there are multiple entries for different nodes then each one should be interlinked(waiting for the child recurrsive call to complete) to another
-   ![fibonnacciRecurrenceTree.png](../../Recursion/fibonnacciRecurrenceTree.png)

##   Space Complexity
-   Maximum Height of the call tree from root to leaf will always have the maximum space complexity
-   For eg : Fibonacci (n) the auzilary space it will take will be O(n)

##  Types of recurrenece
-   ![img.png](img.png)


##   Divide and conquere
-   form of representation of recurrence  equation
     -   ![img_1.png](img_1.png)
     - What I understood
     - equation combines the answer + what it(return as it is , store and do some other operastions) demands/takes to do with the answer you get
       - ![img_2.png](img_2.png)

##  Different ways of finding complexity
-   plug & chug
-   master theorem
-   Akra bazzi (1996)


What Akra bazzi ?
-    Eliminates the use of complex master theorem
-    ![img_3.png](img_3.png)
-    ![img_9.png](img_9.png)


## Applying Akra bazzi to derive time complexity for merge sort
-   ![img_4.png](img_4.png)
-   ![img_5.png](img_5.png)
-   ![img_6.png](img_6.png)
-   ![img_7.png](img_7.png)

While applying AK method if P is evaluated to be less than G(x) then g(x) will be the answer for complexity
-   ![img_8.png](img_8.png)


## Applying AK for liner recurrence relation
-   Form of recurrence relation
-   ![img_10.png](img_10.png)



## derive golden ratio & Time complexity with of fibonnacci recurrence relation
-   ![img_14.png](img_14.png)
-   ![img_15.png](img_15.png)
-   ![img_16.png](img_16.png)
-   ![img_11.png](img_11.png)


## identify time complexity of  Fibonnaci series
-   f(n) = f(n-1) + f(n-2)
-   i.e O(derived golden ratio by neglecting the less dominating terms)
-   ![img_12.png](img_12.png)
