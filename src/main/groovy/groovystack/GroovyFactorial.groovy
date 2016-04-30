package groovystack

import org.codehaus.groovy.runtime.memoize.Memoize


class GroovyFactorial {
	
	static main(args){
		def count
		count = { Integer n, Integer total = 0 ->
			n == 1 ? total : count(n-1, n+total)
		}
		println count(800)
	}
	
}
