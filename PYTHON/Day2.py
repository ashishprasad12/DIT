#Program 6
#price= int(input("Enter price of item: "))
#if price>1000 and price<1500:
#    discount=price*0.1
#    price=price-discount
#print(price)

#Program 7
#salary=int(input("Enter Salary: "))
#da=salary*.25
#hra=salary*.10
#gross=salary+da+hra
#print(gross)

#Program 8
#marks = int(input("Enter Marks: "))
#if marks>=90:
#    print("Hey! Nerd")
#elif marks>=80:
#    print("Cool")
#elif marks>=70:
#    print("You can do better than this")
#elif marks>=60:
#    print("Better have a good excuse")
#elif marks>=50:
#    print("You shall be missed")
#else:
#    print("Better Luck Next Time")


#Program 9
x=int(input("Enter X Coordinate: "))
y=int (input("Enter Y Coordinate: "))

if x<0 and y>0:
    print("2nd Quad")
elif x>0 and y>0:
    print("1st Quad")
elif x<0 and y<0:
    print("3rd Quad")
elif x>0 and y<0:
    print("4th Quad")
else:
    print("Origin")
    
