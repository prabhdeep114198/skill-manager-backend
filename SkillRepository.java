package com.skills;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<skills, Long> {
    List<skills> findByName(String name);

    List<skills> findByExperience(int years);

    List<skills> findByNameAndExperience(String name, int years);

    List<skills> findByFieldOfWorkAndExperienceGreaterThanEqual(String fieldOfWork, int years);
}
