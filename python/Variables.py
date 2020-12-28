myVar1=5 #int
myVar2=10.5 #float
print(myVar1, myVar2)
print(myVar1+myVar2)

str1="Hi! Welcome to Python" #String
print(str1)
str2 = """Hi! Welcome to Python,
lets get started.""" #String having more than one line
print(str2)
	
a = "Hello, World!"
print(a[1]) # Output: "e"
print(a[2:5]) # Output: "llo"
print(len(a)) #13
print(a.lower()) #hello, world!
print(a.upper()) #HELLO, WORLD!
print(a.replace("H", "J")) # Output: "Jello, World!"
print(a.split(",")) # returns ['Hello', ' World!']

	
txt = "The rain in Spain stays mainly in the plain"
x = "ain" in txt
y = "ain" not in txt
print(x) # True
print(y) # False

s1 = "Hello"
s2 = " World"
s3 = s1 + s2
print(s3) # "Hello World"

age = 36
txt = "My name is John, and I am {}"
print(txt.format(age)) 
# Output: My name is John, and I am 36

quantity = 3
itemno = 567
price = 49.95
myorder1 = "I want {} pieces of item {} for {} dollars."
print(myorder1.format(quantity, itemno, price))
# Output: I want 3 pieces of item 567 for 49.95 dollars.

myorder2 = "I want to pay {2} dollars for {0} pieces of item {1}."
print(myorder2.format(quantity, itemno, price))
# Output: I want to pay 49.95 dollars for 3 pieces of item 567.