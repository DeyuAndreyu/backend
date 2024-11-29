package Domain.Category;

import Domain.Subcategory.Subcategory;

import java.util.ArrayList;
import java.util.List;

//Categorie (subcategorie:List<Subcategorie>)
public class Category {
    public List<Subcategory> subcategories = new ArrayList<>();
}
