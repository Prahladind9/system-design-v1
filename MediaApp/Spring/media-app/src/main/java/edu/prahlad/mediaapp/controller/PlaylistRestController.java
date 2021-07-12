package edu.prahlad.mediaapp.controller;

import edu.prahlad.mediaapp.entity.Playlist;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaylistRestController {

    @GetMapping("/playlist/{name}")
    public Playlist getPlaylist(@PathVariable String name) {
        Playlist playlist = new Playlist();
        playlist.setName(name);
        return playlist;
    }

    @PutMapping("/playlist/{id}")
    public Playlist getPlaylist(@PathVariable long id, Playlist playlist) {
        return playlist;
    }
}
