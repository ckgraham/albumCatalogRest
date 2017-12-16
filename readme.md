# albumCatalogRest

A basic CRUD app written with Groovy and Grails.
### Author

Clinton Graham - [GitHub - ckgraham](https://github.com/ckgraham)

### Test cases:

CRUD Operations to test:
1. Create / Update (`POST`)
    - Create / Update Operations using data within constraints as defined in *./grails-app/domain/cgraham/projects/grails/rest/Album.groovy*:
      - name (maxSize = 125, no blanks, not null, unique among artist, genre, country, and record label)
      - artist(maxSize = 100, no blanks, not null)
      - genre(there is a specific list of valid entries defined in Album.groovy)
      - country(maxSize = 55, no blanks, nullable)
      - recordLabel(maxSize = 50), no blanks, nullable)
    - Create / Update Operations using data not within defined constraints as listed above
	- Attempts to create or update that result in duplicate rows, as defined by the `unique`constraint on `name` should be rejected.
2. Read (`GET`)
  - Display 1 record [http://localhost:8080/albums/&lt;id&gt;](http://localhost:8080/albums/1)
  - List all records [http://localhost:8080/albums](http://localhost:8080/albums)
  - Read Operations receving JSON or XML forms (JSON is the default)
    - JSON [http://localhost:8080/albums](http://localhost:8080/albums)
    - XML [http://localhost:8080/albums.xml](http://localhost:8080/albums.xml)
4. Delete (`Delete`) - Deleting rows should be isolated to only those specified in the `DELETE` request.