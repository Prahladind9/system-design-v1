package edu.prahlad.mediaapp.controller;

import edu.prahlad.mediaapp.entity.Playlist;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/playlist")
@Controller
public class PlaylistController {

    @GetMapping("/")
    public String fetchAllPlaylists(Model model) {
        model.addAttribute("playlists", Arrays.asList(new Playlist()));

        // template `playlists` will be rendered using data from `Model`
        return "index";
    }

    @GetMapping("/usingModelAndView")
    public ModelAndView fetchAllPlaylist(){
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("playlists", new Playlist());

        // template `playlists` will be rendered using data from attributes
        return new ModelAndView("index", attributes);
    }

    @PostMapping("/usingModelAndView")
    public ModelAndView createPlaylist(@RequestBody Playlist playlist) {

        Map<String, Object> attributes = new HashMap<>();
        attributes.put("playlists", playlist);

        // template `playlists` will be rendered using data from attributes
        return new ModelAndView("index", attributes);
    }

    @GetMapping("/usingResponseBody")
    public @ResponseBody Playlist fetchAllPlaylists() {
        return new Playlist();
    }

    @GetMapping("/usingRequestParamAndResponseBody")
    public @ResponseBody Playlist fetchAllPlaylists(@RequestParam String name) {
        Playlist playlist = new Playlist();
        playlist.setName(name);
        return playlist;
    }

}
