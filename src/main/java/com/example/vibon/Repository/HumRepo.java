package com.example.vibon.Repository;

import com.example.vibon.Model.Hum;
import com.example.vibon.Model.Temperatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HumRepo extends JpaRepository<Hum, Long> {
}
