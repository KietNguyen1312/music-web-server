package vn.com.music.server.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import vn.com.music.server.common.base.BaseAuditableEntity;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ARTIST")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class ArtistEntity extends BaseAuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "artist_seq")
    @SequenceGenerator(name = "artist_seq", sequenceName = "ARTIST_SEQ", allocationSize = 1)
    private Long id;

    private String name;
    private String bio;
    private String imageUrl;

    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<SongEntity> song;
}