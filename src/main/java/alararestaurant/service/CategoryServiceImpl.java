package alararestaurant.service;

import alararestaurant.domain.entities.Category;
import alararestaurant.domain.entities.Item;
import alararestaurant.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public String exportCategoriesByCountOfItems() {
        StringBuilder sb = new StringBuilder();
        List<Category> categories = this.categoryRepository.findCategoriesByCountItems();

        for (Category category : categories) {
            sb.append(String.format("Category: %s", category.getName())).append(System.lineSeparator());
            for (Item item : category.getItems()) {
                sb.append(String.format("---Item name: %s", item.getName())).append(System.lineSeparator());
                sb.append(String.format("---Item price: %s", item.getPrice())).append(System.lineSeparator())
                        .append(System.lineSeparator());
            }
        }
        return sb.toString().trim();
    }
}
