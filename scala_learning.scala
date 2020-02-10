// Databricks notebook source
// val , var
val variable1: String = "hello world"

// COMMAND ----------

var variable1_var : String = "hello sujitha welcome to scala"

// COMMAND ----------

var variable1_var : String = "hello sujitha welcome to scala"
variable1_var

// COMMAND ----------

var value1 = "hello"

// COMMAND ----------

val variable1 = "heyy guys"
val variable1 + "welcome!!!"

// COMMAND ----------

var value2 = "hey"
value2 = "hey" + "world!"

// COMMAND ----------

val var_byte : Byte = 126
val val_int : Int = 2

// COMMAND ----------

print(f"hello,$val_int")

// COMMAND ----------

// switch statement 
var n : Int = 3
n match {
  case 1 => print("1")
  case 2 => print("2")
  case 3 => print("hello found value is 3")
  case _ => print("not found")
}

// COMMAND ----------

var a = 2
if(a==2){
println("sujitha")
}
else{
  print("donipati")
}

// COMMAND ----------

for(i <- 1 to 4){
  println(i)
}

// COMMAND ----------

var suji = 4
while(suji >= 0)
{
  println(f"suji,$suji")
  suji = suji - 1
}

// COMMAND ----------

val tup = ("hello","goyal",4)
tup


// COMMAND ----------

var list1 = List("tushar","goyal")
list1._1

// COMMAND ----------

var dict = 1 -> "hello"

dict._1

// COMMAND ----------

var list1 = List("sujitha","donipati")
var list2 = List("mahitha","donipati")
list1++list2

// COMMAND ----------

var newlist =List(1,2,3,4,5)
newlist.filter( (x:Int) => x<5)

// COMMAND ----------

var liststring = List("hey","hello")
liststring.filter( (x:String) => (x.length(0) < x.length(1)) )

// COMMAND ----------

var liststring = List("hey","hello")
liststring(1)

// COMMAND ----------

var list6 = List("hey","sujitha","scala","class","is","good")
list6.map( (x:String) => (x(1),1) )

// COMMAND ----------

var ss : Byte = 124
ss.toInt
