def integracion(f: Double => Double, superior: Double, inferior: Double): Double =
  val media:Double = (superior + inferior) / 2
  (inferior - superior) * ((f(superior) + 4 * f(media) + f(inferior)) / 6)

def error(esperado:Double, recibido:Double): Double =
  Math.abs(esperado-recibido)


val f1: Double => Double = (x: Double) => -Math.pow(x, 2) + 8 * x - 12
val rt1: Double = integracion(f1,3,5)
error(rt1,7.33)

val f2: Double => Double = (x: Double) => 3*Math.pow(x,2)
val rt2: Double = integracion(f2,0,2)
error(integracion(f2,0,2),8)

val f3: Double => Double = (x: Double) => x + 2*Math.pow(x,2) - Math.pow(x,3) + 5*Math.pow(x,4)
val rt3: Double = integracion(f3,-1,1)
error(integracion(f3,-1,1), 4.66)

val f4: Double => Double = (x: Double) => ( (2*x+1) / (Math.pow(x,2)+x) )
val rt4: Double = integracion(f4,1,2)
error(integracion(f4,1,2), 1.09999)

val f5: Double => Double = (x: Double) =>  Math.pow(Math.E,x)
val rt5: Double = integracion(f5,0,1)
error(integracion(f5,0,1), 1.71886)

val f6: Double => Double = (x: Double) => ( 1 / (Math.sqrt(x-1)) )
val rt6: Double = integracion(f6,2,3)
error(integracion(f6,2,3),0.828848)

val f7: Double => Double = (x: Double) => ( 1 / (1+Math.pow(x,2)))
val rt7: Double = integracion(f7,0,1)
error(integracion(f7,0,1), 0.783333 )









