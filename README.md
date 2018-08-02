# FullName

FullName provides us with a class "FullName"to implement a simple logic developed on Eclipse IDE for retrieving First name and 
last name from a given string such that output must display FullName = "xxxx jjjj" when a pattern of "xxxx<jjjj" is present in the String or else 
it must display FirstName = "xxxx" and LastName="jjjj" when a pattern of "xxxx<<jjjj" is present in the String. If any individual firstname or lastname without
any concatenation with "<" is present , then it must be disayed individually.

Example Output if the String input is :
  xxxxxx<<jjjjj<<<<jjjjj<xxxxxx<<jjjjj<<xxxxxx<jjjjj<<<<<<xxxxx
  
  then Output on console must be:
    FirstName: xxxxxx
    LastName : jjjjj
    FullName: xxxxxx jjjjj
    LastName : jjjjj
    FullName: xxxxxx jjjjj
    LastName : jjjjj
