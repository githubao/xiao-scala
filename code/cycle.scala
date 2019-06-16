var arrs = Array(1, 2, 3, 4, 5)

for (i <- arrs) {
  println(i)
}

println()

for (i <- 0 until 3) {
  println(i)
}

println()

for (i <- 0 to 3) {
  println(i)
}

println()

//same as until
for (i <- Range(0, 3)) {
  println(i)
}

println()

for (i <- Range(0, 3) if i % 2 == 0) {
  println(i)
}
