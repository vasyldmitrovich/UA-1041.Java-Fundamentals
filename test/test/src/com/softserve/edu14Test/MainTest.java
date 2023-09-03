package test.src.com.softserve.edu14Test;

import com.softserve.edu14.homework.Product;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static com.softserve.edu14.homework.Main.mostPopularProduct;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mostPopularProductNotEmpty() {
        List<Product> productList = List.of(
                new Product("Cup", 2023, 9, 10, 1000),
                new Product("Phone", 2020, 10, 14, 3200),
                new Product("Car", 2023, 4, 10, 130),
                new Product("Notebook", 2023, 3, 21, 150),
                new Product("Cup", 2023, 1, 10, 1000),
                new Product("Laptop", 2023, 4, 14, 250));

        Stream<Product> productStream = productList.stream();
        Optional<String> result = mostPopularProduct(productStream);

        assertTrue(result.isPresent());
        assertEquals("Cup", result.get());
    }

    @Test
    public void testMostPopularProductWithEmptyStream() {
        Stream<Product> emptyStream = Stream.empty();
        Optional<String> result = mostPopularProduct(emptyStream);

        assertTrue(result.isEmpty());
    }
}