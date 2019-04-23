# yts-api
API Wrapper for yts.am

### Functionality
 - List Movies
 - Movie Suggestions
 - Movie Details

### Usage
###### List Movies
```java
List<Movie> movieList = Yts.listMovies("Spiderman", SortBy.DOWNLOAD_COUNT);

for (Movie movie : movieList) {
    System.out.println(movie.id + "\t" + movie.title);
}
```

###### Movie Suggestions
```java
List<Movie> movieSuggestions = Yts.movieSuggestions(1606);

for (Movie movie : movieSuggestions) {
    System.out.println(movie.id + "\t" + movie.title);
}
```

###### Movie Details & Torrents
```java
Movie movie = Yts.movieDetails(3488);

System.out.println("id: " + movie.getId());
System.out.println("title: " + movie.getTitleEnglish());

for (Torrent torrent : movie.getTorrents()) {
    System.out.println("------------------------------------");
    System.out.println(torrent.getPeers() + "/" + torrent.getSeeds());
    System.out.println(torrent.getUrl());
    System.out.println(torrent.getSize() + " - " + torrent.getQuality());
}
```
