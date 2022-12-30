package com.example.vibon.Repository;

import com.example.vibon.Model.HeatIndex;
import com.example.vibon.Model.Temperatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeatIndexRepo extends JpaRepository<HeatIndex, Long> {
}
