package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
