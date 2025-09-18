package vn.khanhduy.model;

import java.util.Set;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import vn.khanhduy.entities.ProductEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class CategoryModel {
	Long categoryId;
	String name;
	Set<ProductEntity> products;
	boolean isEdit = true;
}
