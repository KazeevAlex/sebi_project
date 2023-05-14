package com.bies.idea.repository;

import com.bies.idea.model.Idea;

import java.util.List;

public interface IdeaRepository {

    List<Idea> findAll();

    Idea findById(int theId);

    Idea save(Idea theIdea);

    void deleteById(int theId);
}
