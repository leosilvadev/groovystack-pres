package groovystack

class Curry {
	
	static main(args){
		def sayHello = fn.curry("Hello")
		def helloLeo = sayHello.curry("Léo")
		helloLeo("how are you?")
	}
	
	static def fn = { p1, p2, p3 ->
		println "$p1 $p2, $p3"
	}

}
