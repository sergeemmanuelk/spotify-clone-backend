package dev.skonan.spotifyclonebackend.catalogcontext.repository;

import dev.skonan.spotifyclonebackend.catalogcontext.domain.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
}
