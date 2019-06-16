var add = (x: Int, y: Int) => x + y

def add2(x: Int, y: Int): Int = {
  x + y
}

def greeting(): Unit = {
  println("no need brackets")
}

def printStrings(args: String*): Unit = {
  for (i <- args) {
    printf("Got: %s\n", i)
  }

  println()
}

//println(add(1, 2))
//println(add2(3, 4))
//greeting
//greeting()
printStrings("hello", "multi", "args")