package com.ceva.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class BaseEntity {

    private Long id;
    private LocalDateTime localDateTime;
    private Long insertUserId;
    private LocalDateTime lastUodateDateTime;
    private Long lastUpdateUserId;


}
