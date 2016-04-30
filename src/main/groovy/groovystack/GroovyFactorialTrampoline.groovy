package groovystack

import org.codehaus.groovy.runtime.memoize.Memoize


class GroovyFactorialTrampoline {
	
	static main(args){
		def count
		count = { Integer n, Integer total = 0 ->
			n == 1 ? total : count.trampoline(n-1, n+total)
		}.trampoline()
		println count(800)
	}
	
}
