package groovystack

import groovy.json.JsonOutput
import groovy.xml.MarkupBuilder

class ClosuresDelegate {

	static main(args){
		def html = message {
			title 'Meu titulo'
			body 'Qualquer descricao pro email'
			html
		}
		
		def xml = message {
			title 'Meu titulo'
			body 'Qualquer descricao pro email'
			xml
		}
		
		def json = message {
			title 'Meu titulo'
			body 'Qualquer descricao pro email'
			json
		}
		
		println "Generated HTML:\n $html\n"
		println "Generated XML:\n $xml\n"
		println "Generated JSON:\n $json"
	}
	
	static def message = { Closure function ->
		function.delegate = new EmailTemplate()
		function()
	}
	
	static class EmailTemplate {
		String title
		String body
		def getHtml(){
			def writer = new StringWriter()
			def xml = new MarkupBuilder(writer)
			xml.div() {
				h1(title)
				div(body)
			}
			writer.toString()
		}
		
		def getXml(){
			def writer = new StringWriter()
			def xml = new MarkupBuilder(writer)
			xml.message() {
				tag1(title)
				tag2(body)
			}
			writer.toString()
		}
		
		def getJson(){
			JsonOutput.toJson([title:title, body:body])
		}
		
		def title(title) { this.title = title }
		def body(body) { this.body = body }
	}
	
}
