def matchit(x: Int): String = x match {
  case 0 => "zero"
  case 1 => "one"
  case _ => "other"
}

println(matchit(3))
println(matchit(1))
