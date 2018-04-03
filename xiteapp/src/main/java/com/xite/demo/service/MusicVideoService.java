package com.xite.demo.service;

import com.xite.demo.model.MusicVideo;
import com.xite.demo.repository.MusicVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MusicVideoService implements IMusicVideoService {

    @Autowired
    private MusicVideoRepository musicVideoRepository;

    @Override
    public MusicVideo getMusicVideobyID(long musicVideoID) {

        Optional<MusicVideo> musicVideo = musicVideoRepository.findById(musicVideoID);

        if (!musicVideo.isPresent())
            throw new RuntimeException("ID not found-" + musicVideoID);

        return musicVideo.get();
    }


    @Override
    public MusicVideo createMusicVideo(MusicVideo musicVideo) {

        //check if it is unique
        if (musicVideoRepository.existsById(musicVideo.getId())) {
            throw new RuntimeException("Music ID already exists");
        }

        //check genre whether if it is one of the genre list
        if (!getGenres().contains(musicVideo.getGenre())) {
            throw new RuntimeException("There is no such genre");
        }

        return musicVideoRepository.save(musicVideo);
    }

    @Override
    public MusicVideo updateMusicVideobyID(MusicVideo musicVideo) {

        Optional<MusicVideo> musicVideo1 = musicVideoRepository.findById(musicVideo.getId());

        //check whether result exists
        if (!musicVideo1.isPresent()) {
            throw new RuntimeException("Not found id-" + musicVideo1.get().getId());
        }
        musicVideoRepository.save(musicVideo);

        return musicVideo;
    }

    @Override
    public void deleteMusicVideobyID(long id) {

        Optional<MusicVideo> musicVideo1 = musicVideoRepository.findById(id);

        //check whether result exists
        if (!musicVideo1.isPresent())
            throw new RuntimeException("Not found id-" + musicVideo1.get().getId());

        musicVideoRepository.deleteById(id);
    }


    @Override
    public List<MusicVideo> getAllMusicVideos() {

        return (List<MusicVideo>) musicVideoRepository.findAll();

    }

    @Override
    public List<MusicVideo> getMusicVideobyGenre(String genreName) {
        Optional<List<MusicVideo>> musicList = musicVideoRepository.getMusicVideobyGenre(genreName);

        return returnValueIfPresent(musicList);

    }

    @Override
    public List<MusicVideo> getMusicVideobySubgenre(String subgenre) {
        Optional<List<MusicVideo>> musicList = musicVideoRepository.getMusicVideobySubgenre(subgenre);

        return returnValueIfPresent(musicList);

    }

    public Set<String> getGenres() {
        return new HashSet<>(Arrays.asList("Blues", "Classical", "Country", "Electronic", "Folk", "Jazz", "New age", "Reggae", "Rock"));
    }

    public List<MusicVideo> returnValueIfPresent(Optional<List<MusicVideo>> musicList ){

        //check whether result exists
        if (musicList.isPresent()) {
            return musicList.get();
        }
        return new ArrayList<>();
    }

}
