package groovystack

import spock.lang.Specification

class ExtractionSpec extends Specification {

	def "Should extract the fields existent in a map"(){
		given: 'a map'
			def map = [lang:'Groovy', platform:'JVM', type:'Dynamic']
			
		and: 'two fields to be extracted'
			def fields = ['lang', 'type']
			
		and: 'an extractor'
			def extractor = new Extractor(map)
			
		when: 'the extractor extract the required fields'
			def result = extractor.extract(fields)
			
		then: 'the lang result must be Groovy'
			result.lang == 'Groovy'
			
		and: 'the type result must be Dynamic'
			result.type == 'Dynamic'
	}
	
	def "Should ignore the fields existent in a map"(){
		given: 'a map'
			def map = [lang:'Groovy', platform:'JVM', type:'Dynamic']
			
		and: 'two fields to be extracted'
			def fields = ['lang', 'type']
			
		and: 'an extractor'
			def extractor = new Extractor(map)
			
		when: 'the extractor ignore the required fields'
			def result = extractor.ignore(fields)
			
		then: 'the platform result must be JVM'
			result.platform == 'JVMa'
			
		and: 'the lang result must be ignored'
			!result.lang
			
		and: 'the type result must be ignored'
			!result.type
	}
	
}
