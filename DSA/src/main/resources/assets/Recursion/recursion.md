
major important things to keep in mind
1.  understanding function calls and their order of invocations and return order using stack diagram
2.  focus the variables used within argument,return type,body of recursive function
3.  If the main recursive function is suppose to return the value to main() then the inner recursion calls need to definitely return the value to the parent recursive call.Else the value derived in inner recursive calls are totally lost
4.  Make sure all base conditions are captured and handled to avoid recursive hell

1.If the function just executes and does not return anything in the end of function is called tail recursion
2.If the function executes and return the data to previous recursive call method it is not tail recursion


Types of recurrence
1.  Linear recurrence
    -   We will process the complete tree in linear way without omitting any calls as we need all the data from each recursion
    -   eg:fibonnaci numbers
2.  Divide & conquer recurrence
    -   We need only one final answer present in one of the part of tree so if we are pretty sure that answer is not present in other side of tree via base condition or approach logic we will omit that side and proceed in the tree part that has the only that we expect
    -   Eg: binary search