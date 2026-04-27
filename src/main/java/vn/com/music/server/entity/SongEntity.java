package vn.com.music.server.entity;

import jakarta.persistence.*;
import lombok.*;
import vn.com.music.server.common.base.BaseAuditableEntity;


@Entity
@Table("SONG")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SongEntity extends BaseAuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "song_seq")
    @SequenceGenerator(name = "song_seq", sequenceName = "SONG_SEQ", allocationSize = 1)
    private Long id;

    private String title;
    private String description;
    private String genre;
    private int duration;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "ARTIST")
    private ArtistEntity artist;
}
