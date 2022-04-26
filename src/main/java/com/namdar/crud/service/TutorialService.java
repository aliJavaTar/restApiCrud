package com.namdar.crud.service;

import com.namdar.crud.model.Tutorial;
import org.springframework.stereotype.Service;

@Service
public interface TutorialService {

    Tutorial save(Tutorial tutorial);

}
