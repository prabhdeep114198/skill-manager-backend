package com.skills;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;

    public List<skills> getAllSkills() {
        return skillRepository.findAll();
    }

    public skills getSkillById(Long id) {
        return skillRepository.findById(id).orElse(null);
    }

    public List<skills> getSkillsByName(String name) {
        return skillRepository.findByName(name);
    }

    public List<skills> getSkillsByExperience(int years) {
        return skillRepository.findByExperience(years);
    }

    public List<skills> getSkillsByNameAndExperience(String name, int years) {
        return skillRepository.findByNameAndExperience(name, years);
    }

    public List<skills> getSkillsByFieldOfWorkAndExperience(String fieldOfWork, int years) {
        return skillRepository.findByFieldOfWorkAndExperienceGreaterThanEqual(fieldOfWork, years);
    }

    public skills saveSkill(skills skill) {
        return skillRepository.save(skill);
    }
}
