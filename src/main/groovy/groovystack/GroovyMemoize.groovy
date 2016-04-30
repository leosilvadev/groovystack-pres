package groovystack

import org.codehaus.groovy.runtime.memoize.Memoize


class GroovyMemoize {
	
	static Integer counter = 0
	
	static main(args){
		fnSum(1, 2)
		fnSum(1, 1)
		fnSum(1, 2)
	}
	
	static def fnSum = { n1, n2 ->
		n1 + n2
	}.memoize()

}
