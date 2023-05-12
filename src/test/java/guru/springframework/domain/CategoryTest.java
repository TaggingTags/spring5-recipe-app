package guru.springframework.domain;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class CategoryTest extends TestCase {

    Category category;

    @BeforeEach
    public void setUp(){
        this.category = new Category();
    }

    @Test
    public void testSetId() {
        Long idValue =  4l;

        this.category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    public void testSetDescription() {
    }

    public void testSetRecipes() {
    }
}