package cgraham.projects.grails.rest


import grails.rest.*
import grails.converters.*

class AlbumController extends RestfulController {
    static responseFormats = ['json', 'xml']
    AlbumController() {
        super(Album)
    }
}
