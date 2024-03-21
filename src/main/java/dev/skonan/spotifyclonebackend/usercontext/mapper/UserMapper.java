package dev.skonan.spotifyclonebackend.usercontext.mapper;

import dev.skonan.spotifyclonebackend.usercontext.ReadUserDTO;
import dev.skonan.spotifyclonebackend.usercontext.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    ReadUserDTO readUserDTOToUser(User entity);
}
