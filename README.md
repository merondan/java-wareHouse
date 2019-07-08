# java-wareHouse
small example of the use of ArrayList  for warehouse with java 
item file is the basic unit
file ctegory groups items
file warehouse group categorys
file main test the java project

The code is based on the this methods
1 All methods for the same operation (receiving different parameters)
Call the basic method
This makes it easier to treat the bugs
All calculations will be the same
If there are changes in the software (variables or requirements of the methods)
Change the method in one place and all the other identical methods will change as well
2 short code in each method
 If the code elongates, a new method is created and called
It seemed a little awkward at first
But this creates a readable code that will be understood by another programmers
Since the names of the methods explain what to do
After a while you also find that you spend a lot oless time writing code
Because once you wrote a solution to the problem then you can use the solution wherever the need arises again
And the treatment of the problem is always the same everywhere
3 At each level in the database hierarchy, each method will call the method on the lower level object and use the method code at the current level
For example, the Item object have a String getListDefincies method
Which seems to be ineffective
But when a Category object calls the String getListDefincies method
It only handles its level and at Item level the problem has already been addressed
And so does the WareHouse object level 
