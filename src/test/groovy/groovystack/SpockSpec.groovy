package groovystack

import spock.lang.Specification

class SpockSpec extends Specification {

	def "Should extract a subname from a name"(){
		given: 'a name'
			def name = 'Jao Maria Jose'
		when: 'the subname is extracted using substring'
			def subname = name.substring(4)
		then: 'the subname must be ok'
			notThrown(StringIndexOutOfBoundsException)
		and:
			subname == 'Maria Jose'
	}
	
	def "Should not extract a subname if it is bigger than name"(){
		given: 'a name'
			def name = 'Jao Maria Jose'
		when: 'the subname is extracted using substring'
			name.substring(4, 20)
		then: 'it must throws an exception'
			thrown(StringIndexOutOfBoundsException)
	}
	
}
