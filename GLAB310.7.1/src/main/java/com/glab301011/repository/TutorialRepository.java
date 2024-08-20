package com.glab301011.repository;

import com.glab301011.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;


@RepositoryRestResource(path = "learningtutorials")
public interface TutorialRepository extends JpaRepository<Tutorial, Long>
{
    //   findByPublished is a custom method()
    List<Tutorial> findByPublished(boolean published);
}
