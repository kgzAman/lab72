package com.edu.aman.chat.repository;

import com.edu.aman.chat.entity.Massage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MassageRepository extends JpaRepository<Massage,Long> {
}
