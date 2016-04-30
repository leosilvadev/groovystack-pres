package groovystack

class Arquivos {
	
	def static linhasDo(enderecoDoArquivo){
		new File(enderecoDoArquivo).readLines()
	}
	
	static main(args){
		def linhas = linhasDo('/home/leonardo/dev/workspace/groovystack/files/leiame.txt')
		linhas.each System.&println
	}

}
