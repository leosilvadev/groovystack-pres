package groovystack

class Closures {

	static main(args){
		def addPre = { "pre-$it" }
		addPre.delegate
		def names = ["leo", "jao", "maria", "jose"].asImmutable()
		names.collect(addPre).each(System.&println)
	}
	
}
