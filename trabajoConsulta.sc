def integracion(f: Double => Double, inferior: Double, superior: Double): Double =
  val media:Double = (superior + inferior) / 2
  (superior - inferior) * ((f(inferior) + 4 * f(media) + f(superior)) / 6)

def error(esperado:Double, recibido:Double): Double =
  Math.abs(esperado-recibido)


val f1: Double => Double = (x: Double) => -Math.pow(x, 2) + 8 * x - 12
val rt1: Double = integracion(f1,3,5)
error(7.33,rt1)

val f2: Double => Double = (x: Double) => 3*Math.pow(x,2)
val rt2: Double = integracion(f2,0,2)
error(8,rt2)

val f3: Double => Double = (x: Double) => x + 2*Math.pow(x,2) - Math.pow(x,3) + 5*Math.pow(x,4)
val rt3: Double = integracion(f3,-1,1)
error(3.33, rt3)

val f4: Double => Double = (x: Double) => ( (2*x+1) / (Math.pow(x,2)+x) )
val rt4: Double = integracion(f4,1,2)
error(1.09861,rt4)

val f5: Double => Double = (x: Double) =>  Math.pow(Math.E,x)
val rt5: Double = integracion(f5,0,1)
error(1.71828,rt5)

val f6: Double => Double = (x: Double) => ( 1 / (Math.sqrt(x-1)) )
val rt6: Double = integracion(f6,2,3)
error(0.828427,rt6)

val f7: Double => Double = (x: Double) => ( 1 / (1+Math.pow(x,2)))
val rt7: Double = integracion(f7,0,1)
error(0.785398,rt7 )









