package SpringJpa;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BlogService {
    @Autowired
     BlogRepository repo;



    public void save(BlogMVC theBlog) {
        repo.save(theBlog);
    }

    public List<BlogMVC> listAll() {
        return (List<BlogMVC>) repo.findAll();
    }

    public BlogMVC get(int id) {
        return repo.findById(id).get();
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}
