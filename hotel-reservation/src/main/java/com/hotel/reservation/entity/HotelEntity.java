package com.hotel.reservation.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name="staff_members")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String staffId;

    private String staff_name;

    @Column(unique = true)
    private String staff_email;

    private String staff_password;
}
