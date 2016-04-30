package groovystack

class Application {

	static main(args){
		def builtBy = System.getenv().myName
		println "First gradle application!!"
		println "The app was built by $builtBy"
	}
	
}
