import datetime
s=int(input("enter number"))
if(s==1):
 x=datetime.datetime.now()
 print(x)
if(s==4):
 for i in range(1,11):
      n=s*i
      print(s,'*',i,'=',n)
