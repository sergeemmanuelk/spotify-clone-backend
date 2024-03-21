package dev.skonan.spotifyclonebackend.catalogcontext.application.dto;

import dev.skonan.spotifyclonebackend.catalogcontext.application.vo.SongAuthorVO;
import dev.skonan.spotifyclonebackend.catalogcontext.application.vo.SongTitleVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record SaveSongDTO(@Valid SongTitleVO songTitleVO,
                          @Valid SongAuthorVO songAuthorVO,
                          @NotNull byte[] cover,
                          @NotNull String coverContentType,
                          @NotNull byte[] file,
                          @NotNull String fileContentType) {
}
