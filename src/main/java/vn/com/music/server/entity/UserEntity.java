package vn.com.music.server.entity;

import jakarta.persistence.*;
import lombok.*;
import vn.com.music.server.common.base.BaseAuditableEntity;

@Entity
@Table(name = "USERS")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity extends BaseAuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "USERS_SEQ", allocationSize = 1)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(name = "PASSWORD_HASH", nullable = false)
    private String passwordHash;

    private String fullName;

    @Column(unique = true)
    private String email;

    // Phân quyền: ROLE_USER, ROLE_ADMIN
    private String role;

    // Phục vụ OAuth2 sau này
    private String provider; // LOCAL, GOOGLE, FACEBOOK
    private String providerId;

    private boolean enabled = true;
}