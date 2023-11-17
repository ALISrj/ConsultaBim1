def derive(f: Double => Double, a: Double, b: Double): Double =
  val media:Double = (a + b) / 2
  (b - a) * ((f(a) + 4 * f(media) + f(b)) / 6)

def error(esperado:Double, recibido:Double): Double =
  Math.abs(esperado-recibido)


val f1: Double => Double = (x: Double) => -Math.pow(x, 2) + 8 * x - 12
derive(f1,3,5)
error(derive(f1,3,5),7.33)

val f2: Double => Double = (x: Double) => 3*Math.pow(x,2)
derive(f2,0,2)
error(derive(f2,0,2),8)

val f3: Double => Double = (x: Double) => x + 2*Math.pow(x,2) - Math.pow(x,3) + 5*Math.pow(x,4)
derive(f3,-1,1)
error(derive(f3,-1,1), 4.66)

val f4: Double => Double = (x: Double) => ( (2*x+1) / (Math.pow(x,2)+x) )
derive(f4,1,2)
error(derive(f4,1,2), 1.09999)

val f5: Double => Double = (x: Double) =>  Math.pow(Math.E,x)
derive(f5,0,1)
error(derive(f5,0,1), 1.71886)

val f6: Double => Double = (x: Double) => ( 1 / (Math.sqrt(x-1)) )
derive(f6,2,3)
error(derive(f6,2,3),0.828848)

val f7: Double => Double = (x: Double) => ( 1 / (1+Math.pow(x,2)))
derive(f7,0,1)
error(derive(f7,0,1), 0.783333 )









