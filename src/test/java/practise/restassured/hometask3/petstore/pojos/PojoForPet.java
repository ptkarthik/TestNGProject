package practise.restassured.hometask3.petstore.pojos;

import lombok.Data;

import java.util.List;

@Data
public class PojoForPet {
    private int id;
    private Category category;
    private String name;
    private List<String> photoUrls;
    private List<Category> tags;
    private String status;

    public PojoForPet(int id, Category category, String name, List<String> photoUrls, List<Category> tags, String status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }
}
