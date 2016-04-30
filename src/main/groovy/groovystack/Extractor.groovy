package groovystack

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked


@CompileStatic
@TypeChecked
class Extractor {
	
	final Map map
	
	Extractor(Map map){ this.map = map }
	
	Map extract(List fields){
		map.subMap(fields)
	}
	
	Map ignore(List fields){
		map.findAll ignored.curry(fields)
	}

	Closure ignored = { List fields, key, value ->
		!fields.contains(key)
	}
}
