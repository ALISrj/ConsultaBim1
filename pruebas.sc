(1 to 10).product

def f(n:Int) = (1 to n).product
f(10)

(n:Int) => (1 to n).product

case class Persona(edad:Int, nombre:String)

val per1: Persona = Persona(21,"Jorge")

print(per1.edad)
print(per1.nombre)

val personas: List[Persona] = List(Persona(19,"Angela"), Persona(18,"Fernando"))

personas.maxBy(p => p.edad)
personas.maxBy(_.edad)

def isPrime(n: Int): Boolean = (2 to n - 1).forall( k => n % k != 0)
isPrime(3)