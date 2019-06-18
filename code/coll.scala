// 集合
val fruit = Set("apple", "banana")
println(fruit)
println(fruit("apple"))

val nums = collection.mutable.Set(1, 2, 3)
nums += 4
println(nums)

// map
val fruitMap = Map("apple" -> 1, "banana" -> 2)
println(fruitMap)


val fruitMap2 = collection.mutable.Map("apple" -> 1, "banana" -> 2)
fruitMap2.put("peach", 3)
println(fruitMap2)

val arr = Array("a","b")
val arr2 = new Array[String](2)
val arr3 = collection.mutable.ArrayBuffer("1","2")
arr3 += "3"
println(arr(1))
println(arr2(1))
println(arr3)
