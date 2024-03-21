package dev.skonan.spotifyclonebackend.catalogcontext.repository;

import dev.skonan.spotifyclonebackend.catalogcontext.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
