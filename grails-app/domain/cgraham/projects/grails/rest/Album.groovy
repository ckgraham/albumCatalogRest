package cgraham.projects.grails.rest

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Album {

	String name
	String artist
	String genre
	String recordLabel
	String country

	short yearReleased

    static constraints = {
    	name maxSize: 255, blank: false, unique: ['artist', 'recordLabel', 'country', 'yearReleased']
    	artist maxSize: 255, blank: false
    	genre inList: ['Blues', 'Brass & Military', 'Children\'s', 'Classical', 'Country', 'Electronic', 'Folk', 'Funk / Soul', 'Hip-Hop', 'Jazz', 'Latin','Reggae', 'Rock', 'Stage & Screen', 'World']
    	recordLabel blank: false, nullable: true
        country maxSize: 55, nullable: true
    	yearReleased min:(short)1900
    }
}
