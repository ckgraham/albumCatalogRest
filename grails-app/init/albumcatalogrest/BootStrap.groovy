package albumcatalogrest

import grails.converters.JSON
import cgraham.projects.grails.rest.*

class BootStrap {

    def init = { servletContext ->


    	new Album(name:'Kid A', artist:'Radiohead', genre:'Rock', recordLabel: ' Capitol Records', country:'USA',yearReleased:2000).save(flush:true, failonerror:true)
    	new Album(name:'Zaireeka', artist:'The Flaming Lips', genre:'Rock', recordLabel: 'Warner Bros. Records', country:'USA', yearReleased:1997).save(flush:true, failonerror:true)
		new Album(name:'Quality Control', artist:'Jurassic 5', genre:'Hip-Hop', recordLabel: 'Interscope Records', country:'USA', yearReleased:2000).save(flush:true, failonerror:true)
    	new Album(name:'Immunity', artist:'Jon Hopkins', genre:'Electronic', recordLabel: 'Domino Records', country:'USA', yearReleased:2013).save(flush:true, failOnError:true)
    	new Album(name:'Bach:The Six Unaccompanied Cello Suites', artist:'Yo-Yo Ma', recordLabel: 'CBS Masterworks', genre:'Classical', country:'USA', yearReleased:1983).save(flush:true, failOnError:true)
    }


    def destroy = {
    }

}
