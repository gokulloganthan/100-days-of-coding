1.Strings are immutable (due to security reasons) whereas arrays are mutable
2.Operator overloading is only allowed "+" operator while concatenating strings
3.For string concatenation atleast one of the left of right part of concatenate needs to be string and other can be of any type
    exmaple : println(new ArrayList<>()+new ArrayList<>()) // not allowed
              println(new ArrayList<>()+""+new ArrayList<>()) //  allowed