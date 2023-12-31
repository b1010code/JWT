package br.com.domingos.jwt.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "channels")
@Entity(name = "channels")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String channelName;
    @Column
    private String description;

}