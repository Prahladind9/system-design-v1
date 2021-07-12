package edu.prahlad.mediaapp.service;

import edu.prahlad.mediaapp.entity.Playlist;
import edu.prahlad.mediaapp.entity.Song;
import edu.prahlad.mediaapp.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.math.BigInteger;
import java.util.List;

@Service
public class PlaylistService {

    // inject dependency of `EntityManager` from application context
    @Autowired
    private EntityManager entityManager;

    // inject dependency of `PlaylistRepository` from application context
    @Autowired
    private PlaylistRepository playlistRepo;

    // fetch all the playlist from `playlist` table using `PlaylistRepository`
    public Iterable<Playlist> getAllPlaylists() {
        return playlistRepo.findAll();
    }

    // fetch all songs inside the given playlist using `@NamedNativeQuery`
    public void getSongs(BigInteger playlistId) {
        List<Song> resultList = entityManager.createNamedQuery("songsByPlaylistId", Song.class)
                .setParameter(1, playlistId)
                .getResultList();
        System.out.println(resultList);
    }
}
