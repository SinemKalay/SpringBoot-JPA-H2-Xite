package com.xite.demo.repository;

import com.xite.demo.model.MusicVideo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MusicVideoRepository extends CrudRepository<MusicVideo, Long> {

    void deleteById(long id);

    MusicVideo save(MusicVideo musicVideo);

    boolean existsById(Long id);

    Optional<MusicVideo> findById(Long aLong);

    @Query("select m from MusicVideo m where m.genre = ?1")
    Optional<List<MusicVideo>> getMusicVideobyGenre(String genreName);

    @Query(value="SELECT m.* FROM MUSIC_VIDEO m JOIN MUSIC_VIDEO_SUBGENRES s ON m.ID=s.MUSIC_VIDEO_ID AND s.SUBGENRES=?1", nativeQuery = true)
    Optional<List<MusicVideo>> getMusicVideobySubgenre(String subgenreName);
}
