package SpringJpa;

import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<BlogMVC, Integer> {
}
