package it.academy.HopeProject.services.Impl;

import it.academy.HopeProject.entity.Category;

public interface CategoryService extends BaseService<Category,Category> {
    Category getByName(String name);
}
