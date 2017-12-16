package cgraham.projects.grails.rest

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Album {

	String name
	String artist
	String genre
    String country
	String recordLabel

    static constraints = {
    	name maxSize: 125, blank: false, unique: ['artist', 'genre', 'country', 'recordLabel']
    	artist maxSize: 100, blank: false
    	genre inList: ['Blues', 'Brass & Military', 'Children\'s', 'Classical', 'Country',
    				   'Electronic', 'Folk / Traditional', 'Funk / Soul', 'Hip-Hop', 'Jazz',' R&B', 
    				   'Reggae', 'Rock', 'Stage & Screen', 'World']
        country maxSize: 55, blank: false, nullable: true
    	recordLabel maxSize: 50, blank: false, nullable: true
    }
}
