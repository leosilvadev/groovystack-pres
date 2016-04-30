package groovystack

import geb.spock.GebSpec

class MyGebSpec extends GebSpec {

	def ""(){
		given:
			def page = 'http://pismo.io/'
			
		when:
			go page
			
		then:
			browser.driver.currentUrl == page
			
		when:
			$('a[href="/fale-conosco"]')[0].click()
			
		then:
			browser.driver.currentUrl == 'http://pismo.io/fale-conosco'
	}
	
}
