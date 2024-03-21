package dev.skonan.spotifyclonebackend.usercontext.repository;

import dev.skonan.spotifyclonebackend.usercontext.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
