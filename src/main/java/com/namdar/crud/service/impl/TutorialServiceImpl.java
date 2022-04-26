package com.namdar.crud.service.impl;

import com.namdar.crud.model.Tutorial;
import com.namdar.crud.repasitory.TutorialRepository;
import com.namdar.crud.service.TutorialService;
import org.springframework.stereotype.Service;

@Service
public class TutorialServiceImpl implements TutorialService {
    private final TutorialRepository tutorialRepository;

    public TutorialServiceImpl(TutorialRepository tutorialRepository) {
        this.tutorialRepository = tutorialRepository;
    }

    @Override
    public Tutorial save(Tutorial tutorial) {
        return tutorialRepository.save(tutorial);
    }
}
