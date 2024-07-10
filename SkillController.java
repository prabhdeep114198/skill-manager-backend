package com.skills;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skills")
public class SkillController {
    @Autowired
    private SkillService skillService;

    @GetMapping
    public List<skills> getAllSkills() {
        return skillService.getAllSkills();
    }

    @GetMapping("/{id}")
    public skills getSkillById(@PathVariable Long id) {
        return skillService.getSkillById(id);
    }

    @GetMapping("/name/{name}")
    public List<skills> getSkillsByName(@PathVariable String name) {
        return skillService.getSkillsByName(name);
    }

    @GetMapping("/experience/{years}")
    public List<skills> getSkillsByExperience(@PathVariable int years) {
        return skillService.getSkillsByExperience(years);
    }

    @GetMapping("/search")
    public List<skills> getSkillsByNameAndExperience(@RequestParam String name, @RequestParam int years) {
        return skillService.getSkillsByNameAndExperience(name, years);
    }

    @GetMapping("/fieldOfWorkAndExperience")
    public List<skills> getSkillsByFieldOfWorkAndExperience(@RequestParam String fieldOfWork, @RequestParam int years) {
        return skillService.getSkillsByFieldOfWorkAndExperience(fieldOfWork, years);
    }

    @PostMapping
    public skills createSkill(@RequestBody skills skill) {
        return skillService.saveSkill(skill);
    }
}
